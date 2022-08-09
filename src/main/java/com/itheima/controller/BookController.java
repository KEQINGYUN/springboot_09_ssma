package com.itheima.controller;

import com.itheima.controller.utils.R;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    IBookService iBookService;

    @GetMapping
    public R getAll(){
        return new R(true,iBookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book){
       return  new R(iBookService.save(book));

    }
    @PutMapping
    public R update(@RequestBody Book book){

        return  new R(iBookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable  Integer id){
        return  new R(iBookService.delete(id));
    }
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable  int currentPage,@PathVariable  int pageSize){
        return new R(true,iBookService.getPage(currentPage,pageSize));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage2(@PathVariable  int currentPage,@PathVariable  int pageSize){
        return new R(true,iBookService.getPage(currentPage,pageSize));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage3(@PathVariable  int currentPage,@PathVariable  int pageSize){
        return new R(true,iBookService.getPage(currentPage,pageSize));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public R getPage4(@PathVariable  int currentPage,@PathVariable  int pageSize){
        System.out.println("master test");
        System.out.println("hot-fix");
        System.out.println("push test");
        System.out.println("pull test");
        return new R(true,iBookService.getPage(currentPage,pageSize));
    }

}
