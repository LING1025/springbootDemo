package com.funtl.hello.spring.boot.service;

import com.funtl.hello.spring.boot.domain.TbContentCategory;

public interface TbContentCategoryService {
    /**
     * 插入数据
     * @param tbContentCategory
     * @return
     */
    Integer insert(TbContentCategory tbContentCategory);

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    TbContentCategory selectById(Long id);

    /**
     * 根据id删除信息
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 修改信息
     * @param tbContentCategory
     * @return
     */
    Integer update(TbContentCategory tbContentCategory);

}
