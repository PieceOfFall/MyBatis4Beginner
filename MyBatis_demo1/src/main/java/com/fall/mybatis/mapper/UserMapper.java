package com.fall.mybatis.mapper;

public interface UserMapper {
    /**
     * Two consistent of Interface Oriented Program in MyBatis:
     * 1、The namespace of the mapping file should be consistent with the full class name of the mapper interface
     * 2、The id of SQL statement in the mapping file should be consistent with the method name of the mapper interface
    */

    /**
    * @author 94031
    * @description $add user's info
    * @date 16:54 2022/9/14
    */
    int insertUser();
}
