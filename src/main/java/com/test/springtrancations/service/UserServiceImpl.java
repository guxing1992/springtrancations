package com.test.springtrancations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springtrancations.db1.dao.UserDb1Mapper;
import com.test.springtrancations.db2.dao.UserDb2Mapper;
import com.test.springtrancations.vo.UserVO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDb1Mapper userDb1Mapper;
	@Autowired
	UserDb2Mapper userDb2Mapper;
	/**
	 * 需要对2个数据库进行操作
	 */
	@Override
	public int addUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub
		userDb1Mapper.addUser(userVO);
		userDb2Mapper.addUser(userVO);
		return 1;
	}

}
