package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Book;
import tws.repository.BookMapper;

@RestController
@RequestMapping("/bookin")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @PostMapping("")
    public void insertBook(@RequestBody Book book){
        bookMapper.insertBook(book);
    }

}
