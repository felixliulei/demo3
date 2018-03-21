package com.example.demo.mapper;

import com.example.demo.model.Demo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {
    public List<Demo> likeName(String name);
    public Demo getById(long id);
    public String getNameById(long id);

    public void save(Demo name);

    public List<Demo> getAll();
}
