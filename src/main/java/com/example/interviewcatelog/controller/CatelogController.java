package com.example.interviewcatelog.controller;

import com.example.interviewcatelog.domain.Catelog;
import com.example.interviewcatelog.service.CatelogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catelog")
public class CatelogController {

    @Autowired
    private CatelogService service;

    @GetMapping("/list/{category}")
    public List<Catelog> getListByCategory(@PathVariable String category){
        return service.getListByCategory(category);
    }

    @GetMapping("/{id}")
    public Catelog geyById(@PathVariable int id){
        return service.getById(id);
    }
}
