package com.raisetech.mysql.sample.controller;

import com.raisetech.mysql.sample.entity.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NameResponse {
    private String name;


    public NameResponse(Name name) {
        this.name = name.getName();

    }
}
