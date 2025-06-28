package com.ams.pojo.response;

import com.ams.pojo.beans.CodeListBean;
import lombok.Data;

import java.util.List;

@Data
public class CodeListResponse extends BaseResponse {

    private List<CodeListBean> codeListBeanList;

    private CodeListBean codeListBean;

}
