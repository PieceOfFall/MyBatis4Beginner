package com.fall.mybatis.test;

import com.fall.mybatis.mapper.DynamicSQLMapper;
import com.fall.mybatis.pojo.Emp;
import com.fall.mybatis.utils.SqlSessionUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/21 16:02
 *
 * Dynamic SQL:
 * 1、if: to decide if splicing the content in label into the sql statement according
 *         to the attribute 'test' in related expression
 * 2、where:
 *  a> It will automatically generate the keyword 'where', and remove redundant
 *     'and','or' in front of the statement when the label has its content inside
 *  b> It won't take effect when nothing is in the label
 */

@Slf4j
public class DynamicSQLMapperTest {

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emp = mapper.getEmpByCondition(new Emp(null, "张三", 23, "男", "123@qq.com", null));
        log.info(emp.toString());
    }

}
