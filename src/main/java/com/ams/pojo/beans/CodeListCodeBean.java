package com.ams.pojo.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CodeListCodeBean {

    private Long recordId;

    private String code;

    private String codeValue;

    private String codeDescription;

    private CodeListBean codeListBean;
}
