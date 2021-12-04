package com.kele.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kele.mybatisplus.dto.User;
import com.kele.mybatisplus.mapper.UserMapper;
import com.kele.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 02089472
 * @since 2021-07-07
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser() {
        return baseMapper.selectOne(
                new QueryWrapper<User>()
                        .lambda()
                        .eq(User::getId, "bbf943ee-18f3-497b-b8d4-58b36f61c18b")
                        .orderByAsc(User::getUpdateTime)
        );
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(
                new QueryWrapper<User>()
                        .lambda()
                        .gt(User::getUpdateTime, "2021-07-06 20:45:50")
                        .like(User::getName, "root")
                        .and(obj -> obj.lt(User::getCreateTime, "2021-07-06 21:35:32")
                                .or()
                                .isNotNull(User::getName))
        );
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
