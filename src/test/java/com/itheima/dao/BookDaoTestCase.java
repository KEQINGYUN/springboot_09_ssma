package com.itheima.dao;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private  BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book=new Book();
        book.setType("测试11123");
        book.setName("测试123");
        book.setDescription("测试123");
        bookDao.insert(book);
    }
    @Test
    void testUpdate(){
        Book book=new Book();
        book.setId(15);
        book.setType("测试0000");
        book.setName("测试123");
        book.setDescription("测试123");
        bookDao.updateById(book);
    }
    @Test
    void testDelete(){
        bookDao.deleteById(15);
    }
    @Test
    void testGetAll(){
      bookDao.selectList(null);
    }
    @Test
    void testGetPage(){
        IPage page=new Page(2,5);
        bookDao.selectPage(page,null);

    }
    @Test
    void testGetBy(){
        String name="1";
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<>();
        lqw.like(name!=null,Book::getName,"spring");
        bookDao.selectList(lqw);
    }
}
