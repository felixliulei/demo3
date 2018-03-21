package com.example.demo.service;

import com.example.demo.model.Demo;
import com.example.demo.mapper.DemoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    DemoMapper demoMapper;

    public List<Demo> likeName(String name){

        return demoMapper.likeName(name);
    }

    public void save(Demo demo){
        demoMapper.save(demo);
    }

    @Transactional
    public List<Demo> getAll(){

        return demoMapper.getAll();
    }
}
