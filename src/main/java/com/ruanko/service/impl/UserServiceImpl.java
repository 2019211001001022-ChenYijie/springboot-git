package com.ruanko.service.impl;

import java.util.List;
import java.util.Optional;

import com.ruanko.dao.TeamDao;
import com.ruanko.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruanko.dao.UserDao;
import com.ruanko.entity.User;
import com.ruanko.service.UserService;

/**
 * 
* Title: UserServiceImpl
* Description: 
* 用户操作实现类 
* Version:1.0.0  

 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		boolean flag=false;
		try{
			userDao.save(user);
			flag=true;
		}catch(Exception e){
			System.out.println("新增失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag=false;
		try{
			userDao.save(user);
		flag=true;
	}catch(Exception e){
		System.out.println("修改失败!");
		e.printStackTrace();
	}
		return flag;
	}

	@Override
	public boolean deleteUser(Integer id) {
		boolean flag=false;
		try{
			userDao.deleteById(id);
			flag=true;
		}catch(Exception e){
			System.out.println("删除失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User findUserById(Integer id) {
		try{
			Optional<User> user=userDao.findById(id);
			if(user.isPresent())
				return user.get();
		}catch(Exception e){
			System.out.println("查询失败!");
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public List<User> findAll() {

	    return userDao.findAll();
	}
}
