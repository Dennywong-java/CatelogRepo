package com.example.interviewcatelog.service;

import com.example.interviewcatelog.domain.Catelog;
import com.example.interviewcatelog.repository.CatelogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatelogService {

    @Autowired
    private CatelogRepository repo;

    public List<Catelog> getListByCategory(String category) {
        return repo.findByCategory(category);
    }

    public Catelog getById(int id) {
        return repo.findById(id);
    }
}
