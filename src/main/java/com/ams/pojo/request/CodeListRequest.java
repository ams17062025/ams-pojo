package com.ams.pojo.request;

import com.ams.pojo.beans.CodeListBean;
import com.ams.pojo.beans.Pagination;
import lombok.Data;

@Data
public class CodeListRequest extends BaseRequest {
    private CodeListBean codeListBean;
}
