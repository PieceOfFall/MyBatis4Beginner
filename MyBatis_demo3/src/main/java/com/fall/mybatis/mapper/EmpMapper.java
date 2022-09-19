package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/19 12:09
 */
public interface EmpMapper {

    /**
     * @author FAll
     * @description get all emps' info
     * @param
     * @return: java.util.List<com.fall.mybatis.pojo.Emp>
     * @date 2022/9/19 12:52
     */
    List<Emp> getAllEmp();

    /**
     * @author FAll
     * @description get info about user and user's department by eid
     * @param eid
     * @return: com.fall.mybatis.pojo.Emp
     * @date 2022/9/19 17:41
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

}
