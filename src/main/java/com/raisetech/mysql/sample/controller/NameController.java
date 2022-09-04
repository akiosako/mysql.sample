package com.raisetech.mysql.sample.controller;

import com.raisetech.mysql.sample.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class NameController {
    private NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<NameResponse> getName() {
        return nameService.findAll().stream().map(NameResponse::new).collect(Collectors.toList());
    }
}
