package com.test.springtrancations.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.springtrancations.service.UserService;
import com.test.springtrancations.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:context/datasource-context.xml")
public class MyTest {
	@Autowired
	UserService userService;
	@Test
	public void test1() {
		for (int i = 0; i < 1000; i++) {
			UserVO userVO = new UserVO();
			userVO.setUsername("liuliu11"+i);
			userVO.setPassword("00800821"+i);
			userVO.setSex(3+i);
			try {
				userService.addUser(userVO);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
