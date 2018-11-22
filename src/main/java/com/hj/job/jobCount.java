package com.hj.job;

import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hj.serviceImpl.StatisticsServiceImpl;

/**
 * @Description 每天23点统计阅览室人数
 * @author HJiong
 * @time 2018-10-11 下午12:21:45
 */
@Component
@EnableScheduling
public class jobCount {
	
	@Autowired
	private StatisticsServiceImpl service;
	
	/**
	 * 23:00统计刷卡次数
	 */
	@Scheduled(cron="00 00 23 * * ?")
	public void execute() throws JobExecutionException {
		System.out.println("任务调度23:00统计执行");
		service.addByConsumelogs();
	}
	
	

}
