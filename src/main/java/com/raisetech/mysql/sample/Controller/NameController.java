package com.raisetech.mysql.sample.Controller;

import com.raisetech.mysql.sample.mapper.NameMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    private NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/name")
    public String getName() {
        return nameMapper.findName();
    }
}
