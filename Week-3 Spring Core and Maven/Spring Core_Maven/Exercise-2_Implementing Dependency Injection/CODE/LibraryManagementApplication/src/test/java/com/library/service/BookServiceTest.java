package com.library.service;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    private ApplicationContext context;

	@Test
    public void testDisplayBook() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        
        assertNotNull(bookService);
        bookService.displayBook(); // Should print output to console
    }
}
