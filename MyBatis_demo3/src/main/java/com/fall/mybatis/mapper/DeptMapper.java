package com.fall.mybatis.mapper;

import com.fall.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author FAll
 * @date 2022/9/19 12:10
 */
public interface DeptMapper {

    /**
     * @author FAll
     * @description step two here
     * @param did
     * @return: com.fall.mybatis.pojo.Dept
     * @date 2022/9/20 17:53
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * @author FAll
     * @description get the info about the department and the employees in the department
     * @param did
     * @return: com.fall.mybatis.pojo.Dept
     * @date 2022/9/20 18:56
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * @author FAll
     * @description get the info about the department and the employees in
     *              the department by hybrid lookup (step two is in the EmpMapper)
     * @param did
     * @return: com.fall.mybatis.pojo.Dept
     * @date 2022/9/20 19:25
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
