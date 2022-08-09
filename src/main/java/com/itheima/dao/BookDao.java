package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tbl_book where id=#{id}")
//    Book getById(Integer id);

}
