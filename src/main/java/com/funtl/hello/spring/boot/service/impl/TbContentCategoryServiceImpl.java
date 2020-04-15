package com.funtl.hello.spring.boot.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.funtl.hello.spring.boot.domain.TbContentCategory;
import com.funtl.hello.spring.boot.mapper.TbContentCategoryMapper;
import com.funtl.hello.spring.boot.service.TbContentCategoryService;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

    @Override
    public Integer insert(TbContentCategory tbContentCategory) {
        return tbContentCategoryMapper.addTb(tbContentCategory);
    }

    @Override
    public TbContentCategory selectById(Long id) {
        return tbContentCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(Long id) {
        return tbContentCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(TbContentCategory tbContentCategory) {
        return tbContentCategoryMapper.updateByPrimaryKeySelective(tbContentCategory);
    }

}
