package com.funtl.hello.spring.boot.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "TbContentCategory")
public class TbContentCategory implements Serializable {
    /**
     * 类目ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    @Column(name = "parentId")
    private Long parentId;

    /**
     * 分类名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    @Column(name = "sortOrder")
    private Integer sortOrder;

    private static final long serialVersionUID = 1L;

}