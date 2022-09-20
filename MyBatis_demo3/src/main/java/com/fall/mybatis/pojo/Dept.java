package com.fall.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author FAll
 * @date 2022/9/19 12:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dept {

    private Integer did;

    private String deptName;

    private List<Emp> emps;

}
