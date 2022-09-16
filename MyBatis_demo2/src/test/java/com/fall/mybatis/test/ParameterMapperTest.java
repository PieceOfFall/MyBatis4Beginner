package com.fall.mybatis.test;

import com.fall.mybatis.mapper.ParameterMapper;
import com.fall.mybatis.pojo.User;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author FAll
 * @date 2022/9/16 12:35
 */
@Slf4j
public class ParameterMapperTest {

    /**
     * two ways to get params in MyBatis: ${} and #{}
     * ${} is just a simple string concatenation --can't protect from SQL injection
     * #{} is an assignment with placeholder
     *
     * sorts of cases when getting params in MyBatis:
     * 1、type of params in the method of mapper interface is singly literal.
     *    (look out the problem cased by using ${} without '' surrounded)
     * 2、method of mapper interface has multiple params.
     *    (in this case,MyBatis will put these params into a map collection, and store them in two manners:
     *    a> take arg0,arg1... as keys, and params as values
     *    b> take param1,param2... as keys, and params as values)
     * 3、put these params into a map collection manually when method of mapper interface has multiple params.
     * 4、type of params in the method of mapper interface is entity.
     * 5、use the annotation @Param to name params
     *    (in this case,MyBatis will also put these params into a map collection, and store them in two manners:
     *    a> take the value of annotation @Param as keys, and params as values
     *    b> take param1,param2... as keys, and params as values)
     */

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int ret = mapper.insertUser(new User(null, "李四", "123", 23, "男", "123@qq.com"));
        log.info(String.valueOf(ret));
    }
    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("admin", "123456");
        log.info(user.toString());
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        log.info(user.toString());
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("admin","123456");
        log.info(user.toString());
    }

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("admin");
        log.info(user.toString());
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        for (User user : mapper.getAllUser()) {
            log.info(user.toString());
        }

    }
}
