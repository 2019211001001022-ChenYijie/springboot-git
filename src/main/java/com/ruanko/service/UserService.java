package com.ruanko.service;

import java.util.List;

import com.ruanko.entity.Team;
import com.ruanko.entity.User;


/**
 * 
* Title: UserService
* Description: 
* 用户接口 
* Version:1.0.0  

 */
public interface UserService {
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
	
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	boolean deleteUser(Integer id);
	
	/**
     * 根据用户id查询用户信息
     * @param id
     */
	User findUserById(Integer id);
    /**
     * 查询所有
     * @return
     */
	List<User> findAll();

}
