package com.hj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hj.entity.Teachers;
import com.hj.serviceImpl.TeachersServiceImpl;
import com.hj.util.ImportExcel;

/**
 * @Description 教师控制层
 * @author HJiong
 * @time 2018年10月30日 上午10:19:10
 */
@RestController
@RequestMapping("/teacher")
public class TeachersController {
	@Autowired
	private TeachersServiceImpl service;
	
	/**
	 * 查询所有教师&根据姓名模糊查询
	 * @return
	 */
	@RequestMapping("/query")
	public Object queryAll(String name) {
		List<Teachers> list=service.queryAll(name);
 		return list;
	}
	
	/**
	 * 添加教师
	 * @return
	 */
	@RequestMapping("/add")
	public Object add(Teachers teachers) {
		return service.add(teachers);
	}
	/**
	 * 删除教师 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	public Object delete(Integer id) {
		System.out.println("!!!");
		return service.delte(id);
	}
	
	/**
	 * 修改教师 
	 * @param id
	 * @return
	 */
	@RequestMapping("/update")
	public Object update(Teachers teachers) {
		return service.update(teachers);
	}
	
	/**
	 * 导入excel
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("all")
	@RequestMapping("/importTc")
	public Object importTc(@RequestParam(value="file",required=false) MultipartFile myfile,Integer id) throws IOException{
		try {
			 HSSFWorkbook workbook=new HSSFWorkbook(myfile.getInputStream());//创建hssworkbook
			 Map<String, String> keyMap= new HashMap<String, String>();
			 keyMap.put("cardno", "卡号");
			 keyMap.put("name", "姓名");
			 keyMap.put("sex", "性别");
			 keyMap.put("status", "状态（0/1）");
			 keyMap.put("remake", "备注");
			 if(id==null||id.equals("")||id.equals("undefined")){
				 return false;
			 }
			 //为其传入对应的字段map集合、workbook、父表字段、父表字段值、及导入的类型全类名
			 List<Object> list=ImportExcel.imporList(keyMap, workbook,"sectionid",id,"com.hj.entity.Teachers");
			 for (Object object : list) {
				Teachers teachers=(Teachers) object;
				service.add(teachers);
			}
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
