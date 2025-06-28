package com.ams.pojo.response;

import lombok.Data;

import java.util.List;

@Data
public class BaseResponse {

    private String status;

    private Error error;



}
