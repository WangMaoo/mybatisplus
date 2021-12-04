package com.kele.mybatisplus.service;

import com.kele.mybatisplus.dto.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 02089472
 * @since 2021-07-07
 */
public interface IUserService extends IService<User> {

    User getUser();

    List<User> getUserList();

    List<User> getAllUsers();
}
