package com.ams.pojo.request;

import com.ams.pojo.beans.UserBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserRequest {
    UserBean userBean;
}
