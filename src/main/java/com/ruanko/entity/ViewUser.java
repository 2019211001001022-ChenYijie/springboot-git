package com.ruanko.entity;

/**
 * 
* Title: User
* Description:用户实体类
* Version:1.0.0  

 */
public class ViewUser {

	 /** 编号 */
	 private Integer id;
	 /** 姓名 */
	 private String username;
	 /** 密码*/
	 private String password;
	 /** 年龄 */
	 private Integer age;

	 private Team team;

	 public ViewUser(){

	 }

	 public ViewUser(User user){
		 setId(user.getId());
		 setUsername(user.getUsername());
		 setPassword(user.getPassword());
		 setAge(user.getAge());
	 }

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	/**
	 * 获取编号  
	 * @return id 
	 */
	public Integer getId() {
		return id;
	}

	/**  
	 * 设置编号  
	 * @param id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**  
	 * 获取姓名  
	 * @return name 
	 */
	public String getUsername() {
		return username;
	}

	/**  
	 * 设置姓名  
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	/**  
	 * 获取密码  
	 * @return  password  
	 */
	public String getPassword() {
		return password;
	}

	/**  
	 * 设置密码  
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**  
	 * 获取年龄  
	 * @return  age  
	 */
	public Integer getAge() {
		return age;
	}
	/**  
	 * 设置年龄  
	 * @param age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
