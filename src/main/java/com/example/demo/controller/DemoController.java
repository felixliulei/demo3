package com.example.demo.controller;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/likeName")
    public List<Demo> likeName(String name, int page){
        /**
         * 第一个参数第几页
         * 第二个参数获取条数
         */
        PageHelper.startPage(page,2);
        return demoService.likeName(name);
    }
    @PostMapping("/save")
    @ApiOperation(value="新增日志",tags = {"日志"})
    public Demo save(@RequestBody Demo demo){
        demo.setName("bbb");
        demoService.save(demo);
        return demo;
    }

    @RequestMapping("/getAll")
    public List<Demo> getAll(){
        ;
        return demoService.getAll();
    }

}
