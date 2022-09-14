package com.fall.mybatis.test;

import com.fall.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSession won't automatically commit transactions by default,
 * if necessary, you can use SqlSessionFactory.openSession(ture);
 *
 * @author 94031
 * @date 2022/9/14 17:19
 */

@Slf4j
public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
        //load main configuration file
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //get SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //get SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //get SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //get object that implements mapper interface
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //test
        int ret = mapper.insertUser();

        log.info("result:"+ret);

        //commit transaction
        // sqlSession.commit();

    }
}
