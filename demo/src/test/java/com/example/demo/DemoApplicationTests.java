package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.query.UserQueryObject;
import com.example.demo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private IUserService userService;
	@Test
	@Transactional
	public void saveUser() {
		User user1 = new User();
		user1.setName("zml");
		user1.setPassword("123");
		user1.setUsername("zml");
		userService.save(user1);
		throw new RuntimeException("hello");
	}

	@Test
	public void list(){
		UserQueryObject qo = new UserQueryObject();
		qo.setPageNo(1);
		qo.setPageSize(2);
		List<User> list = userService.list(qo);
		for (User user: list
			 ) {
			System.out.println(user.getUsername());
		}
	}
}
