package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService IbookService;
    @Test
    void testGetById(){
        System.out.println(IbookService.getById(4));
    }
    @Test
    void testSave(){
        Book book=new Book();
        book.setType("测试11123");
        book.setName("测试123");
        book.setDescription("测试123");
        IbookService.save(book);
    }
    @Test
    void testUpdate(){
        Book book=new Book();
        book.setId(42);
        book.setType("测试0000000000000");
        book.setName("测试142");
        book.setDescription("测试42");
        IbookService.updateById(book);
    }
    @Test
    void testDelete(){
        IbookService.removeById(13);
    }
    @Test
    void testGetAll(){
        IbookService.list();
    }
    @Test
    void testGetPage(){
        IPage<Book> page=new Page<Book>(2,5);
        IbookService.page(page);

    }

}
