package com.ams.pojo.request;

import com.ams.pojo.beans.Pagination;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseRequest {
    private Pagination pagination;
}
