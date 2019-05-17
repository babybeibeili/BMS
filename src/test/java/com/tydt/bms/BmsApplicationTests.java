package com.tydt.bms;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tydt.bms.system.model.User;
import com.tydt.bms.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmsApplicationTests {

	@Autowired
	UserService userService;
	/**
	 * 插入
	 */
	/*
	@Test
	public void Test() throws Exception{
		User user=new User();
		user.setUsername("sss111");
		user.setPassword("ac089b11709f9b9e9980e7c497268dfa");
		user.setCrateTime(new Date());
		user.setStatus("0");
		userService.save(user);
	}
	*/
	/**
	 * 查询
	 */
	/*
	@Test
	public void query() throws Exception{

		System.out.println("condition  ----------");
		Example example = new Example(User.class);
		example.createCriteria().andCondition("username like '%a%'");
		example.setOrderByClause("user_id desc");
		List<User> userList = this.userService.selectByExample(example);
		for(User u:userList){
			System.out.println(u.getUsername());
		}

		System.out.println("all ----------");
		//
		List<User> all = this.userService.selectAll();
		for(User u:all){
			System.out.println(u.getUsername());
		}

		System.out.println("one ----------");

		User one = new User();
		one.setUserId((long)6);
		one = this.userService.selectByKey(one);
		System.out.println(one.getUsername());

	}
	*/
	/**
	 * 更新
	 */
	/*
	@Test
	public void updateTest() throws Exception{
		User u = new User();
		u.setUserId((long)173);
		u = this.userService.selectByKey(u);
		u.setUsername("abc123");
		this.userService.updateAll(u);
	}
	*/

	/**
	 * 删除
	 */
	/*
	@Test
	public void deleteTest() throws Exception{
		User u = new User();
		u.setUserId((long)173);
		this.userService.delete(u);
	}
	*/
	/**
	 * 分页
	 */
	@Test
	public void pageTest() throws Exception{
		PageHelper.startPage(3,5);
		List<User> list = userService.selectAll();
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		List<User> rs = pageInfo.getList();
		for(User u:rs){
			System.out.println(u.getUsername());
		}
	}

	/*
	@Test
	public void contextLoads() {
	}
	*/

}
