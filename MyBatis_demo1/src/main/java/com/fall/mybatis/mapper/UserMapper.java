package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * Two consistent of Interface Oriented Program in MyBatis:
     * 1、The namespace of the mapping file should be consistent with the full class name of the mapper interface
     * 2、The id of SQL statement in the mapping file should be consistent with the method name of the mapper interface
    */

    /**
    * @author FAll
    * @description $add user's info
    * @date 16:54 2022/9/14
    */
    int insertUser();

    /**
    * @author FAll
    * @description $update user's info
    * @date 12:08 2022/9/15
    */
    void updateUser();

    /**
    * @author FAll
    * @description $delete user's info
    * @date 12:17 2022/9/15
    */
    void deleteUser();

    /**
    * @author FAll
    * @description $get user by id
    * @date 12:23 2022/9/15
    */
    User getUserById();

    /**
    * @author FAll
    * @description $get all users
    * @date 12:41 2022/9/15
    */
    List<User> getAllUser();

}
