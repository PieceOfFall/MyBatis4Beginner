package com.fall.mybatis.test;

import com.fall.mybatis.mapper.ParameterMapper;
import com.fall.mybatis.pojo.User;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author FAll
 * @date 2022/9/16 12:35
 */
@Slf4j
public class ParameterMapperTest {

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        for (User user : mapper.getAllUser()) {
            log.info(user.toString());
        }

    }
}
