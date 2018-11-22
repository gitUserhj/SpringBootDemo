package com.hj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hj.dao.ReadroomsMapper;
import com.hj.entity.Readrooms;
import com.hj.service.ReadroomsService;

/**
 * @Description 阅览器业务实现层
 * @author HJiong
 * @time 2018年11月1日 上午11:23:44
 */
@Service
public class ReadroomsServiceImpl implements ReadroomsService {
	@Autowired
	private ReadroomsMapper rDao;
	
	/**
	 * 	查询所有阅览室
	 */
	@Override
	public List<Readrooms> query() {
		// TODO Auto-generated method stub
		return rDao.selectAll();
	}

	
}
