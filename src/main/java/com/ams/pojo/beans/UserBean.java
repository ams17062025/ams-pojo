package com.ams.pojo.beans;

import lombok.Data;

@Data
public class UserBean {
    private Long recordId;
    private String userName;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String gender;
}
