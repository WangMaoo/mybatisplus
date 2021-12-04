package com.kele.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kele.mybatisplus.dto.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 02089472
 * @since 2021-07-07
 */
public interface UserMapper extends BaseMapper<User> {

     List<User> getAllUsers();

}
