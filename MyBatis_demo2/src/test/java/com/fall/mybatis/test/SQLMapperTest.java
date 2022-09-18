package com.fall.mybatis.test;

import com.fall.mybatis.mapper.SQLMapper;
import com.fall.mybatis.pojo.User;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/18 16:19
 */
@Slf4j
public class SQLMapperTest {
    @Test
    public void TestGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        for (User user : list) {
            log.info(user.toString());
        }
    }

    @Test
    public void TestDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        log.info(String.valueOf(mapper.deleteMore("4,5,6")));
    }

    @Test
    public void getUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> users = mapper.getUserByTableName("t_user");
        for (User user : users) {
            log.info(user.toString());
        }
    }

    @Test
    public void TestInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "王五", "123", 23, "男", "123@163.com");
        mapper.insertUser(user);
        log.info(user.toString());
    }

}
