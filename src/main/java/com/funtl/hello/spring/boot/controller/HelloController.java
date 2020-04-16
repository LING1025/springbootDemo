package com.funtl.hello.spring.boot.controller;

import com.funtl.hello.spring.boot.domain.TbContentCategory;
import com.funtl.hello.spring.boot.dto.TbContentCategoryParamDto;
import com.funtl.hello.spring.boot.service.TbContentCategoryService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private TbContentCategoryService tbContentCategoryService;

    @GetMapping("/")
    public String sayHello() {
        return "HelloSpringBoot";

    }

    @PostMapping("/insert")
    public String insert(@RequestBody TbContentCategoryParamDto tbCategoryParamDto){
        if(tbCategoryParamDto.getId() != 0){
            return "id参数异常";
        }
        TbContentCategory tbContentCategory = new TbContentCategory();
        BeanUtils.copyProperties(tbCategoryParamDto,tbContentCategory);
        Integer i = tbContentCategoryService.insert(tbContentCategory);
        if(i == 0){
            return "保存失败";
        }
        return "保存成功";
        
    }

    @PutMapping("/update")
    public String update(@RequestBody TbContentCategoryParamDto tbCategoryParamDto){
        TbContentCategory tbContentCategory = tbContentCategoryService.selectById(tbCategoryParamDto.getId());
        if(tbContentCategory == null){
            return "未查询到信息";
        }
        BeanUtils.copyProperties(tbCategoryParamDto,tbContentCategory);
        Integer i = tbContentCategoryService.update(tbContentCategory);
        if(i == 0){
            return "修改失败";
        }
        return "修改成功";
    }

    @GetMapping("/query/{id}")
    public TbContentCategory query(@PathVariable Long id){
        TbContentCategory tbContentCategory = tbContentCategoryService.selectById(id);
        return tbContentCategory;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        Integer i = tbContentCategoryService.deleteById(id);
        if(i == 0){
            return "删除失败";
        }
        return "删除成功";
    }

}
