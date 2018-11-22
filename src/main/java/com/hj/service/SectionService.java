package com.hj.service;

import java.util.List;

import com.hj.entity.Sections;

/**
 * 科室业务接口	
 * @Description 
 * @author HJiong
 * @time 2018年10月30日 上午11:15:20
 */
public interface SectionService {
	/**
	 * 查询所有
	 * @return
	 */
	public List<Sections> queryAll();
	
	/**
	 * 添加
	 * @return
	 */
	public int add(Sections record);
	
	/**
	 * 修改
	 * @return
	 */
	public int update(Sections record);
	
	/**
	 * 删除
	 * @return
	 */
	public int delete();
}
