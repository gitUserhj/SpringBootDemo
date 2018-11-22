package com.hj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hj.serviceImpl.ConsumelogsServiceImpl;

/**
 * @Description 刷卡记录控制层
 * @author HJiong
 * @time 2018年11月1日 下午12:03:32
 */
@RequestMapping("/consumelog")
@RestController
public class ConsumelogsController {
	
	@Autowired
	ConsumelogsServiceImpl cService;
	
	
	
	@RequestMapping("/query")
	public Object query() {
		return cService.queryAll();
	}
}
