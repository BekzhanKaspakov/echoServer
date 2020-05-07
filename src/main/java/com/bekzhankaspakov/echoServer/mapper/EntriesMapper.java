package com.bekzhankaspakov.echoServer.mapper;

import com.bekzhankaspakov.echoServer.model.Entry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EntriesMapper {

    @Select("Select * from entries")
    List<Entry> findAll();
}
