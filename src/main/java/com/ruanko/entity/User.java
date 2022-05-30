package com.ruanko.entity;

import javax.persistence.*;

/**
 * Title: User
 * Description:用户实体类
 * Version:1.0.0
 */
@Entity
@Table(name = "user")
public class User {

    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    /**
     * 姓名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 年龄
     */
    private Integer age;

    @Column(name = "team_id")
    private Integer teamId;

    public User() {
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取编号
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置姓名
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * 获取密码
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取年龄
     *
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }


}
