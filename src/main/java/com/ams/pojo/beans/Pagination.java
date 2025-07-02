package com.ams.pojo.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pagination {
    int pageNumber;
    int pageSize;
    int noOfPage;
    int totalCount;
}
