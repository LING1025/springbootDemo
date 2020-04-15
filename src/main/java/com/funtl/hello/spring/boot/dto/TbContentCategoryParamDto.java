package com.funtl.hello.spring.boot.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class TbContentCategoryParamDto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;
}