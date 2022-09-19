package com.fall.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author FAll
 * @date 2022/9/19 10:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emp {

    private Integer eid;

    private String empName;

    private Integer age;

    private String sex;

    private String email;

    private Dept dept;

}
