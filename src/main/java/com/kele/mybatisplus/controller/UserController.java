package com.kele.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kele.mybatisplus.dto.User;
import com.kele.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 02089472
 * @since 2021-07-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @RequestMapping("getUserById")
    public User getUserById() {
        return userService.getById("15c9f65b-a425-4598-a663-843347963a9e");
    }

    @RequestMapping("getUser")
    public User getUser() {
        return userService.getUser();
    }

    @RequestMapping("getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping("getUserPage")
    public Page<User> getUserPageList() {
        Page<User> page = new Page<>(1, 2);
        return (Page<User>) userService.page(page, new QueryWrapper<User>().lambda().like(User::getName, "root"));
    }

    @RequestMapping("getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


}
