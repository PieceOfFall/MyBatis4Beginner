package com.fall.mybatis.test;

import com.fall.mybatis.mapper.SelectMapper;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



/**
 * @author FAll
 * @date 2022/9/18 13:27
 *
 * sorts of query cases in MyBatis:
 * 1、If the result is only one in total, we can receive it by an entity object or a collection
 * 2、If having multiple results, we can't receive them by entity object but by a list collection,
 *    else the procedure will throw a TooManyResultsException
 *
 * MyBatis has set some default type aliases:
 * Java.lang.Integer-->int,integer
 * int-->_int,_integer
 * Map-->map
 * String-->string
 */
@Slf4j
public class SelectMapperTest {
    @Test
    public void testAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        log.info(mapper.getAllUserToMap().toString());
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        log.info(mapper.getUserByIdToMap(3).toString());
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        log.info(mapper.getUserById(4).toString());
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        log.info(mapper.getAllUser().toString());
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        log.info(String.valueOf(mapper.getCount()));

    }

}
