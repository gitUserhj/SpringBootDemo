package com.hj.service;

import java.util.List;

import com.hj.entity.Consumelogs;

/**
 * @Description 阅览室记录业务接口
 * @author HJiong
 * @time 2018年10月31日 下午11:18:46
 */
public interface ConsumelogsService {
	
	/**
	 * 	根据卡号查询记录
	 * @return
	 */
	public List<Consumelogs> queryBycardNo(String cardNo);
	
	
	/**
	 * 	修改刷卡记录
	 * @return
	 */
	public int update(Consumelogs consumelogs);
	
	/**
	 * 	添加刷卡记录
	 * @param consumelogs
	 * @return
	 */
	public int add(Consumelogs consumelogs);
	
	/**
	 * 	查询刷卡记录All
	 * @return
	 */
	public List<Consumelogs> queryAll();
	
}
