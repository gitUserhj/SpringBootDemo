package com.hj.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hj.serviceImpl.StatisticsServiceImpl;

/**
 * @Description 日统计控制层
 * @author HJiong
 * @time 2018年11月1日 下午6:43:37
 */
@RequestMapping("/statistics")
@RestController
public class StatisticsController {
	
	@Autowired
	StatisticsServiceImpl service;
	
	/**
	 * 	日统计图表
	 * @return
	 */
	@RequestMapping("/eCharts")
	public Object eCharts(String ksTime,String jsTime) {
		Map<String, Object> map=service.Echarts(ksTime,jsTime);
		Map<String, Object> restMap=new HashMap<String, Object>();
		restMap.put("rq", map.get("rq"));
		map.keySet().remove("rq");
		map.values().remove("rq");
		restMap.put("name",map.keySet());
		restMap.put("data",map.values());
		return restMap;
	}
	

}
