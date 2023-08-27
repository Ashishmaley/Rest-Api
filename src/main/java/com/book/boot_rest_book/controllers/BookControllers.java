package com.book.boot_rest_book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.book.boot_rest_book.book;
import com.book.boot_rest_book.BookService.service;

@RestController
public class BookControllers {
    @Autowired
    private service bookService;

    @GetMapping(value = "/books")
    public List<book> getBooks() {
        return bookService.getAllbooks();
    }
    @GetMapping(value = "/books/{id}")
    public book getBook(@PathVariable("id") int id){
        return bookService.getOne(id);
    }

}
