package com.funtl.hello.spring.boot.mapper;

import com.funtl.hello.spring.boot.domain.TbContentCategory;
import tk.mybatis.mapper.MyMapper;

public interface TbContentCategoryMapper extends MyMapper<TbContentCategory> {

	Integer addTb(TbContentCategory tbContentCategory);

}