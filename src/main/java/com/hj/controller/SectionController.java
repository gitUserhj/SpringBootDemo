package com.hj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hj.entity.Sections;
import com.hj.serviceImpl.SectionServiceImpl;

/**
 * @Description 科室控制层
 * @author HJiong
 * @time 2018年10月30日 上午11:13:06
 */
@RequestMapping("/sections")
@RestController
public class SectionController {
	@Autowired
	private SectionServiceImpl service;
	
	/**
	 * 查询所有教师
	 * @return
	 */
	@RequestMapping("/query")
	public Object queryAll() {
		return service.queryAll();
	}
	
	/**
	 * 添加科室
	 * @return
	 */
	@RequestMapping("/add")
	public Object add(Sections record) {
		return service.add(record);
	}
	
	/**
	 * 修改科室
	 * @return
	 */
	@RequestMapping("/update")
	public Object update(Sections record) {
		return service.update(record);
	}
	
	/**
	 * 删除科室
	 * @return
	 */
	@RequestMapping("/delete")
	public Object delete(int id) {
		return service.delete(id);
	}
}
