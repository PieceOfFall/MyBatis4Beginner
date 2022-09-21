package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/21 15:50
 */
public interface DynamicSQLMapper {

    /**
     * @author FAll
     * @description query by multiple conditions
     * @param emp
     * @return: java.util.List<com.fall.mybatis.pojo.Emp>
     * @date 2022/9/21 15:52
     */
    List<Emp> getEmpByCondition(Emp emp);

}
