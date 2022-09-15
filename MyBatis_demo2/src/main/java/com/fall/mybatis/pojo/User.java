package com.fall.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author FAll
 * @date 2022/9/15 15:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;

}
