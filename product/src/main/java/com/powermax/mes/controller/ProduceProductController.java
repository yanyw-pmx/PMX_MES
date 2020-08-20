package com.powermax.mes.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.powermax.mes.common.api.CommonResult;
import com.powermax.mes.mapper.ProduceProductMapper;
import com.powermax.mes.model.ProduceProduct;
import com.powermax.mes.model.ProduceProductExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@Api(value = "product",description = "产品测试接口")
@RequestMapping("/produceproduct")
@RestController
public class ProduceProductController {
    @Autowired
    private ProduceProductMapper produceProductMapper;

    @ApiOperation(value = "查找全部",httpMethod="GET")
    @RequestMapping("/selectByExample")
    public List<ProduceProduct> selectByExample(){
       return  produceProductMapper.selectByExample(new ProduceProductExample());
    }

    @ApiOperation(value = "格式化json数据输出",httpMethod="GET")
    @RequestMapping("/selectByExampleCres")
    public CommonResult<List<ProduceProduct>> selectByExampleCres(){
        return  CommonResult.success(produceProductMapper.selectByExample(new ProduceProductExample()));
    }

    @ApiOperation(value = "查找全部页面",httpMethod="GET")
    @RequestMapping("/selectByExamplePage")
    PageInfo<ProduceProduct> findAllPage(){
        PageHelper.startPage(1,2);
        List<ProduceProduct> all = produceProductMapper.selectByExample(new ProduceProductExample());
        PageInfo pageInfo = new PageInfo<>(all);
        return pageInfo;
    }

    @ApiOperation(value = "id中填入要查找的ID",httpMethod="GET")
    @RequestMapping("/selectByPrimaryKey/{id}")
    ProduceProduct selectByPrimaryKey(@PathVariable("id") Long id) {
        ProduceProduct produceProduct = produceProductMapper.selectByPrimaryKey(id);
        System.out.println(produceProduct);
        return produceProduct;
    }
}
