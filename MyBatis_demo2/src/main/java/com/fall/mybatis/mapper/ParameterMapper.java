package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author FAll
 * @date 2022/9/15 15:38
 */
public interface ParameterMapper {

    /**
    * @author FAll
    * @description $verify and login
    * @param username
    * @param password
    * @date 13:37 2022/9/16
    */
    User checkLogin(String username,String password);

    /**
     * @author FAll
     * @description $verify and login but the param is a map collection
     * @param map
     * @date 14:13 2022/9/16
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
    * @author FAll
    * @description $verify and login with the annotation @Param
    * @param username
    * @param password
    * @date 14:56 2022/9/16
    */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     *@author FAll
     *@description add a user's info
     * @param user
     * @return: int
     *@date 2022/9/18 12:59
     */
    int insertUser(User user);

    /**
    * @author FAll
    * @description $query user's info by username
    * @param username
    * @date 13:08 2022/9/16
    */
    User getUserByUsername(String username);

    /**
    * @author FAll
    * @description $query all employees' info
    * @date 12:31 2022/9/16
    */
    List<User> getAllUser();

}
