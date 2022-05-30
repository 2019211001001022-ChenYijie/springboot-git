package com.ruanko.service.impl;

import com.ruanko.dao.TeamDao;
import com.ruanko.dao.UserDao;
import com.ruanko.entity.Team;
import com.ruanko.entity.User;
import com.ruanko.service.TeamService;
import com.ruanko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 
* Title: TeamServiceImpl
* Description: 
* 小组操作实现类
* Version:1.0.0  

 */
@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDao teamDao;

	@Override
	public Team findById(Integer id) {
		try{
			Optional<Team> team=teamDao.findById(id);
			if(team.isPresent())
				return team.get();
		}catch(Exception e){
			System.out.println("查询失败!");
			e.printStackTrace();

		}
		return null;
	}

}
