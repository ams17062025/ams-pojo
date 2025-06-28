package com.ams.pojo.beans;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CodeListBean {

    private Long recordId;

    private String name;

    private String description;

    private List<CodeListCodeBean> codeListCodeBeans;
}
