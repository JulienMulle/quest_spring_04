package com.quest_spring04.quest.spring4.controller;

import com.quest_spring04.quest.spring4.entity.Book;
import com.quest_spring04.quest.spring4.repository.BookRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> index(){
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}"){
        public Book show(@PathVariable("id") int id){
            return bookRepository.findById(id).get();
        }
    }

    @PostMapping("/books/search"){
        public List<Book> search(@RequestBody Map<String> body){
            String searchTerm = body.get("text");
            return bookRepository.findByTitleContainOrContentContaining(searchTerm);
        }
    }

    @PostMapping("/books"){
        public Book create(@RequestBody Book book ){
            String title = body.get("title");
            String author = body.get("author");
            String description = body.get("description");
            return bookRepository.save(book);
        }
    }

    @PutMapping("/books/{id}"){
        public Book update(@PathVariable("id") int id, @RequestBody Book book){
            Book bookToUpdate = bookRepository.findById(id).get();
            bookToUpdate.setTitle(book.getTitle());
            bookToUpdate.setAuthor(book.getAuthor());
            bookToUpdate.setDescription(book.getDescription());
        }
    }

    @DeleteMapping("books/{id}")
    public boolean delete(@PathVariable int id){
        bookRepository.deleteById(id);
        return true;
    }
}
