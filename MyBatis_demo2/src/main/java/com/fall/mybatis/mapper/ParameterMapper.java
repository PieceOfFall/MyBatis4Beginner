package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.User;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/15 15:38
 */
public interface ParameterMapper {

    /**
    * @author FAll
    * @description $query all employees' info
    * @date 12:31 2022/9/16
    */
    List<User> getAllUser();

}
