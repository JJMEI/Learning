package org.apache.test.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser {
    private Long id;
    private String userName;
    private Integer age;
    private String sex;
    private String iphone;
    private String email;
    private String address;
    private Date createTime;
    private Date modifyTime;



}
