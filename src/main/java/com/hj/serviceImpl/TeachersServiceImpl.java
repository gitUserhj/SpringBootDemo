package com.hj.serviceImpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.dao.TeachersMapper;
import com.hj.entity.Teachers;

/**
 * @Description 教师业务实现层
 * @author HJiong
 * @time 2018年10月30日 上午10:21:47
 */
@Service
public class TeachersServiceImpl {
	@Autowired
	private TeachersMapper tDao;
	
	
	/**
	 * 查询所有教师 根据姓名模糊查询
	 * @return
	 */
	public List<Teachers> queryAll(String name) {
		return tDao.selectAll(name);
	}
	
	/**
	 * 添加教师
	 * @return
	 */
	public int add(Teachers teachers) {
		teachers.setStatus(0);
		Random r = new Random();
		teachers.setCardno(System.nanoTime()+""+ r.nextInt());
		return tDao.insert(teachers);
	}
	
	/**
	 * 删除教师
	 * @param id
	 * @return
	 */
	public int delte(Integer id) {
		return tDao.deleteByPrimaryKey(id);
	}
	
	/**
	 * 修改教师
	 * @param teachers
	 * @return
	 */
	public int update(Teachers teachers) {
		return tDao.updateByPrimaryKey(teachers);
	}
	
}
