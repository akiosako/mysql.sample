package com.raisetech.mysql.sample.service;

import com.raisetech.mysql.sample.entity.Name;

import java.util.List;

public interface NameService {
    List<Name> findAll();
}
