package com.hj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.dao.SectionsMapper;
import com.hj.entity.Sections;

/**
 * 科室业务接口	
 * @Description 
 * @author HJiong
 * @time 2018年10月30日 上午11:15:20
 */
@Service
public class SectionServiceImpl {
	@Autowired
	private SectionsMapper sDao;
	
	/**
	 * 查询所有科室
	 * @return
	 */
	public List<Sections> queryAll(){
		return sDao.selectAll();
	}
	
	/**
	 * 添加科室
	 * @param record
	 * @return
	 */
	public int add(Sections record) {
		
		return sDao.insert(record);
	}
	
	/**
	 * 修改
	 * @return
	 */
	public int update(Sections record) {
		return sDao.updateByPrimaryKey(record);
	}
	
	/**
	 * 删除
	 */
	public int delete(int id) {
		return sDao.deleteByPrimaryKey(id);
	}
}
