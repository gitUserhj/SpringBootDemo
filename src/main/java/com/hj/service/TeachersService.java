package com.hj.service;

import java.util.List;

import com.hj.entity.Teachers;

/**
 * @Description 教师业务实现接口
 * @author HJiong
 * @time 2018年10月30日 上午10:21:47
 */
public interface TeachersService {
	
	/**
	 * 查询所有教师 根据姓名模糊查询
	 * @return
	 */
	public List<Teachers> queryAll(String name);
	
	/**
	 * 添加教师
	 * @return
	 */
	public int add(Teachers teachers);
	
	/**
	 * 删除教师
	 */
	public int delete(Integer id);
	
	/**
	 * 修改教师
	 * @param teachers
	 * @return
	 */
	public int update( Teachers teachers);
}
