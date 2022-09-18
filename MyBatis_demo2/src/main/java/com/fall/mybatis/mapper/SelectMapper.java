package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author FAll
 * @date 2022/9/18 13:20
 */
public interface SelectMapper {
    /**
     *@author FAll
     *@description get user's info by id
     * @param id
     * @return: com.fall.mybatis.pojo.User
     *@date 2022/9/18 13:24
     */
    User getUserById(@Param("id") Integer id);

    /**
     *@author FAll
     *@description get users' info by id
     * @param
     * @return: java.util.List<com.fall.mybatis.pojo.User>
     *@date 2022/9/18 13:42
     */
    List<User> getAllUser();

    /**
     *@author FAll
     *@description get the number of records in the user table
     * @param
     * @return: java.lang.Integer
     *@date 2022/9/18 13:49
     */
    Integer getCount();

    /**
     *@author FAll
     *@description get user's info by id, and the type of return value is map
     * @param id
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     *@date 2022/9/18 14:16
     */
    Map<String,Object> getUserByIdToMap(Integer id);

    /**
     *@author FAll
     *@description get users' info by id, and the type of return value is a map ,although it's multiple.
     *             (In this case, we should use the annotation @MapKey to take results' unique attribute value
     *             as the new key.)
     * @param
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     *@date 2022/9/18 15:31
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();


}
