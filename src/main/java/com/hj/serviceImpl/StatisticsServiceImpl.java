package com.hj.serviceImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.dao.ReadroomsMapper;
import com.hj.dao.StatisticsMapper;
import com.hj.entity.Readrooms;
import com.hj.entity.Statistics;
import com.hj.service.StatisticsService;

/**
 * @Description 刷卡记录统计业务实现层
 * @author HJiong
 * @time 2018年11月1日 上午9:44:47
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
	
	@Autowired
	private StatisticsMapper sDao;
	
	@Autowired
	private ReadroomsMapper rDao;
	
	/**
	 * 	批量添加统计表（用于任务调度）
	 */
	@Override
	public int addByConsumelogs() {
		return sDao.insertAll();
	}
	
	
	/**
	 * 	图表
	 * @return
	 */
	public Map<String, Object> Echarts(String ksTime,String jsTime) {
		Map<String, Object> map=new LinkedHashMap<String,Object>();
		List<String> getDay=new ArrayList<String>();//用于存取查询到的时间集合
		
		List<Readrooms> readroomsList=rDao.selectNo();//查询出阅览室集合
		List<Statistics> statisList=new ArrayList<Statistics>();//用于存储每个时间段阅览室刷卡记录的集合
		for (Readrooms readrooms : readroomsList) {//循环阅览室
			List<String> jfList=new ArrayList<String>();//用于存储此阅览室在每个时间段的使用刷卡次数
			statisList=sDao.queryByTime(ksTime,jsTime,readrooms.getId());//根据时间、阅览室id查询出阅览室刷卡记录存入集合
			for (Statistics statis : statisList) {//循环查询到的当前阅览室在规定时间内的所有刷卡记录
				jfList.add(statis.getPeoplenums()+"");//将当前阅览室刷卡记录存入集合
			}
			//当当前阅览室的没个时间段的刷卡次数循环完，以key（阅览室Name）value(此阅览室每个时间段的刷卡次数)存入map
			map.put(readrooms.getName(),jfList);
			
		}
		//循环符合查询出的规定时间内的阅览室刷卡记录将此时间范围加入集合，用于eCharts X轴（此方法需要每个阅览室的刷卡记录的天数都是一样的）
		for (Statistics statistics : statisList) {
			getDay.add(statistics.getTime());
		}
		map.put("rq", getDay);
		return map;
	}

}
