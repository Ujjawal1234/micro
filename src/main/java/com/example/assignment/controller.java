package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    private StudentRepository repository;
    @PostMapping("/id/{id}")
    public response retrieveExchangeValue(@PathVariable int id) {

        student s = repository.findById(id);
        response response = new response(s.getId(), s.getName(), s.getAge(), new marks(s.getPhysics(), s.getChem()),s.getDiv(),s.getCollege());
        return response;
    }
}
