package com.hj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.dao.ConsumelogsMapper;
import com.hj.entity.Consumelogs;
import com.hj.service.ConsumelogsService;

/**
 * @Description 刷卡记录业务实现层
 * @author HJiong
 * @time 2018年11月1日 上午9:45:02
 */
@Service
public class ConsumelogsServiceImpl implements ConsumelogsService{
	
	@Autowired
	private ConsumelogsMapper csDao;
	
	
	/**
	 * 	根据卡号查询记录
	 * @return
	 */
	public List<Consumelogs> queryBycardNo(String cardNo) {
		return csDao.queryBycardNo(cardNo);
	}


	/**
	 * 	修改刷机记录
	 */
	public int update(Consumelogs consumelogs) {
		return csDao.updateByPrimaryKey(consumelogs);
	}
	
	/**
	 * 	添加刷机记录
	 */
	public int add(Consumelogs consumelogs) {
		return csDao.insert(consumelogs);
	}


	/**
	 * 	查询所有刷卡记录
	 */
	public List<Consumelogs> queryAll() {
		return csDao.queryJoinReadrooms();
	}
	
}
