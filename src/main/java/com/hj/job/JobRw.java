package com.hj.job;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hj.entity.Consumelogs;
import com.hj.entity.Readrooms;
import com.hj.entity.Teachers;
import com.hj.serviceImpl.ConsumelogsServiceImpl;
import com.hj.serviceImpl.ReadroomsServiceImpl;
import com.hj.serviceImpl.TeachersServiceImpl;


/**
 * @Description 生成刷卡记录任务
 * @author HJiong
 * @time 2018年11月01日 下午12:18:46
 */
@Component
//@EnableScheduling
public class JobRw {
	
	@Autowired
	private TeachersServiceImpl tcService;
	@Autowired
	private ConsumelogsServiceImpl clService;
	@Autowired
	private ReadroomsServiceImpl rservice;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	//@Scheduled(cron="*/5 * * * * ?")
	public void job() {
		System.out.println("任务调度生成刷卡记录执行");
		int random=(int)(1+Math.random()*(2));
		if(random==1){//如果随机的是1就查询教师表
			List<Teachers> tcList=tcService.queryAll("");//查询出所有教师
			int randomTc=(int)(Math.random()*(tcList.size()));//创建教师集合长度随机数
			Teachers tc=tcList.get(randomTc);//随机取出一名教师
			List<Consumelogs> cmList=clService.queryBycardNo(tc.getCardno());//查询此教师是否正在读书
			if(cmList.size()>0) {//如果查询出就修改此教师的状态及outTime
				clService.update(new Consumelogs(cmList.get(0).getId(),new Date(),"0"));
				tcService.update(new Teachers(tc.getId(),0));
			}else {//如果没有查询到就添加
				List<Readrooms> rlist=rservice.query();
				int randomrd=(int)(Math.random()*(rlist.size()));//创建阅览室集合长度随机数
				//添加刷卡记录
				clService.add(new Consumelogs(tc.getCardno(),rlist.get(randomrd).getId(),new Date(),null,"1"));
				//修改教师状态
				tcService.update(new Teachers(tc.getId(),rlist.get(randomrd).getId()));
			}
		}else {//就是学生
			
			
		}
	}
}
