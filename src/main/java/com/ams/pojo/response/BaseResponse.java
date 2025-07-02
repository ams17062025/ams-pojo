package com.ams.pojo.response;

import com.ams.pojo.beans.Pagination;
import com.ams.pojo.utils.ResponseStatus;
import lombok.Data;

import java.util.List;
@Data
public class BaseResponse {

    private String status = ResponseStatus.FAILURE.toString();

    private Error error;

    private Pagination pagination;



}
