package com.hj.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;


/**
 * @Description 导入Excel 工具类 
 * @author HJiong
 * @time 2018-10-5 下午11:23:20
 */
public class ImportExcel {
	
	/**
	 * @Description 传入文件列标题对应数据库字段,传入实体类对象,传入实体父表字段与值
	 * @param keyMap
	 * @param workBook
	 * @return
	 */
	public static List<Object> imporList(Map<String, String> keyMap,HSSFWorkbook workBook,String parentColumn,Object parentValue,String className) throws Exception{
		Class<?> clazz=Class.forName(className);
		Object obj=clazz.newInstance();//反射创建实例
		Set<String> keys=keyMap.keySet();//存放传入的map集合中所有key
		List<Object> listObj=new ArrayList<Object>();//存放导入的对象集合
		HSSFSheet sheet =workBook.getSheetAt(0);
		HSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();//获取到第一行总列数
		String[] column=new String[keys.size()];//创建数组 存放数据库字段名
		HSSFCell cell =null;
		for (int i = 0; i < colCount; i++) {//循环第一行所有列
			cell=row.getCell(i);
			String title=cell.getStringCellValue();
			A:for (String key : keys) {
				if(keyMap.get(key).equals(title)){//if传入的标题等于了文件中的某个标题
					column[i]=key;//得到该字段存储数组中
					break A;//跳出本次循环
				}
			}
		}
		
		
		int rowCount = sheet.getLastRowNum();//拿到总行数
		for (int i = 1; i <= rowCount; i++) {//循环所有行
			Field parentField=clazz.getDeclaredField(parentColumn);//反射得到父字段属性
			parentField.setAccessible(true);
			parentField.set(obj, parentValue);//为父字段设置值
			row = sheet.getRow(i);//得到当前行Row对象
			for (int j = 0; j < column.length; j++) {//循环所有列
				cell = row.getCell(j);//得到当前行当前列
				Field thisField=clazz.getDeclaredField(column[j]);//当前循环到的列字段反射得到对应属性
				thisField.setAccessible(true);
				try {
					if(thisField.getType().getName().equals("java.lang.Integer")) {
						cell.setCellType(CellType.NUMERIC);//int类型
						int val=(int) cell.getNumericCellValue();
						//反射调动对应set方法
						thisField.set(obj, val);
					}else {
						cell.setCellType(CellType.STRING);//所有格式都转换成String类型
						String val=cell.getStringCellValue().trim();
						//反射调动对应set方法
						thisField.set(obj, val);
					}
					
				} catch (NullPointerException e) {
					thisField.set(obj, "");//当发生空指针异常的时候设置为空字符串
				}
			}
			listObj.add(obj);
		}
		return listObj;
	}

}
