package com.example.interviewcatelog.repository;

import com.example.interviewcatelog.domain.Catelog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class CatelogRepository {
//        extends JpaRepository<Catelog, Integer>
    private static List<Catelog> catelogs = new ArrayList<>();

    static{
        catelogs.add(new Catelog(1, "java", "book"));
        catelogs.add(new Catelog(2, "3idiots", "movie"));
        catelogs.add(new Catelog(3, "khan", "star"));
    }
    public List<Catelog> findByCategory(String category){
        return catelogs.stream()
                .filter(c -> category.equalsIgnoreCase(c.getCategory()))
                .collect(Collectors.toList());
    }

    public Catelog findById(int id){
        return catelogs.stream()
                .filter(c -> id == c.getId())
                .findFirst()
                .orElse(null);
    }
}
