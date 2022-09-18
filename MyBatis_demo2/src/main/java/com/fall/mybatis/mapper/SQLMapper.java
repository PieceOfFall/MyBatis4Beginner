package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/18 16:08
 */
public interface SQLMapper {

    /**
     * @author FAll
     * @description get user's info by fuzzy query
     * @param username
     * @return: java.util.List<com.fall.mybatis.pojo.User>
     * @date 2022/9/18 16:14
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * @author FAll
     * @description delete multiple records
     * @param ids
     * @return: int
     * @date 2022/9/18 16:39
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * @author FAll
     * @description get info from an appointed table
     * @param tableName
     * @return: java.util.List<com.fall.mybatis.pojo.User>
     * @date 2022/9/18 16:49
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * @author FAll
     * @description add a user
     * @param user
     * @return: java.lang.Integer
     * @date 2022/9/18 17:18
     */
    Integer insertUser(User user);
}
