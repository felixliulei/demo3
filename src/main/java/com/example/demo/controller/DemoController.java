package com.example.demo.controller;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/saveApi")
    @ApiOperation(value="新增日志",tags = {"日志"})
    public Demo saveApi(@RequestBody Demo demo){
        demo.setCat_name("bbb");
        demoService.save(demo);
        return demo;
    }
    @RequestMapping("/save")
    @Transactional
    public Demo save(Demo demo){
        demo.setCat_name("bbb");
        demoService.save(demo);
        int a = 1/0;
        return demo;
    }

    @RequestMapping("/getAll")
    public List<Demo> getAll(){
        ;
        return demoService.getAll();
    }

}
