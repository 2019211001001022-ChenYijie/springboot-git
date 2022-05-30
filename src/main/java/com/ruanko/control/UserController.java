package com.ruanko.control;

import java.util.ArrayList;
import java.util.List;

import com.ruanko.entity.ViewUser;
import com.ruanko.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruanko.entity.User;
import com.ruanko.service.UserService;


/**
 * Title: UserController
 * Description:
 * 用户控制层
 * Version:1.0.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TeamService teamService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/userList";
    }

    @RequestMapping("/viewUserList")
    public String viewUserList(Model model) {
        System.out.println("查询所有ViewUser");
        List<User> users = userService.findAll();

        List<ViewUser> viewUsers = new ArrayList<>();
        for (User user : users) {
            ViewUser viewUser = new ViewUser(user);
            viewUser.setTeam(teamService.findById(user.getTeamId()));
            viewUsers.add(viewUser);
        }

        model.addAttribute("viewUsers", viewUsers);
        return "user/viewUserList";
    }

    @RequestMapping("/userList")
    public String userList(Model model) {
        System.out.println("查询所有user");
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user/userList";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(User user) {
        //设置默认小组id
        user.setTeamId(1);
        userService.addUser(user);
        return "redirect:/";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, int id) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delete(int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}