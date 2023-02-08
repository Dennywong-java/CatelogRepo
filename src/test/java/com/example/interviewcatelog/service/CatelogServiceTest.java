package com.example.interviewcatelog.service;

import com.example.interviewcatelog.domain.Catelog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class CatelogServiceTest {
    @Autowired
    private CatelogService service;

    @Test
    public void testGetListByCategory(){
        String category = "book";
        List<Catelog> list = service.getListByCategory(category);
        Assert.isTrue(list.size() == 1);
        Assert.isTrue(list.get(0).getName().equalsIgnoreCase("java"));
    }
}
