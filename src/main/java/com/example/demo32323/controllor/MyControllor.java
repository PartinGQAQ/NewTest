package com.example.demo32323.controllor;

import com.example.demo32323.anno.Myanno;
import com.example.demo32323.entity.Myentity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
@Api(tags = {"Swagger马瑞祺的学习控制器"})//可以生成好几个控制器访问窗口
public class MyControllor {
    @RequestMapping("/getEntity")
    public Myentity testE(){
        return new Myentity();
    }

    @PostMapping("/post")
    @ApiOperation(value = "Post方法，执行数据新增操作")
    public String post(@ApiParam(name = "用户名（name）",value = "新增用户时提供",required = true)String name,@ApiParam(name = "密码(pwd)",value = "新增用户时提供",required = true) String pwd){
        return "post";
    }

    @GetMapping("/get")
    @ApiOperation(value = "Get方法，获取数据方法")
    @ApiImplicitParam(value = "数据",name = "a",required = true,paramType = "字符串")
    public String get(String a,String b){
        return "get";
    }

    @Myanno
    @RequestMapping("/req")
    public String req(String m){
        return "req";
    }

}
