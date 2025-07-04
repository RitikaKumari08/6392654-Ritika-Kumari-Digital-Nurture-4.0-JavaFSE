package com.library;

import com.library.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class TestLibraryManagement {

    @Test
    public void testAddBook() {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Run addBook and assert any effects (you can check logs, repo, etc.)
        assertDoesNotThrow(() -> bookService.addBook("Feluda Series"));
        
        // Optional: Add more verification if your method returns something or changes state
    }
}
