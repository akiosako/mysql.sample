package com.raisetech.mysql.sample.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM name")
    String findName();
}
