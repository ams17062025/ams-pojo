package com.ams.pojo.response;

import com.ams.pojo.beans.UserBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class UserResponse extends BaseResponse implements Serializable {
    List<UserBean> userList;

    UserBean user;
}
