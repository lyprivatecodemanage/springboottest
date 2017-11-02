package com.xiangshangban.transit_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiangshangban.transit_service.bean.Login;
import com.xiangshangban.transit_service.dao.LoginMapper;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;

	/**
	 * 根据token查询
	 * 
	 * @param token
	 * @return
	 */
	@Override
	public Login selectByToken(String token) {

		return loginMapper.selectByToken(token);
	}

	/**
	 * 添加用户登录信息
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public int insertSelective(Login record) {

		return loginMapper.insertSelective(record);
	}

	/**
	 * 根据sessionId查询
	 * 
	 * @param sessionId
	 * @return
	 */
	@Override
	public Login selectBySessionId(String sessionId) {

		return loginMapper.selectBySessionId(sessionId);
	}

	@Override
	public int updateByPrimaryKeySelective(Login record) {
		
		return loginMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 根据phone查询
	 * 
	 * @param phone
	 * @return
	 */
	@Override
	public Login selectByPhone(String phone) {
		
		return loginMapper.selectByPhone(phone);
	}

}