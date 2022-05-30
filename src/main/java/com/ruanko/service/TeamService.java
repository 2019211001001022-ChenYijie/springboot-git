package com.ruanko.service;

import com.ruanko.entity.Team;
import com.ruanko.entity.User;

import java.util.List;


/**
 * 
* Title: TeamService
* Description: 
* 小组接口
* Version:1.0.0  

 */
public interface TeamService {
	
	/**
	 * 查找小组
	 * @param id
	 * @return Team
	 */
	Team findById(Integer id);
}
