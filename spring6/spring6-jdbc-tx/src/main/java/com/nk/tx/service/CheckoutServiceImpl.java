package com.nk.tx.service;

import com.nk.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    @Autowired
    private BookService bookService;

    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId:bookIds) {
            bookService.buyBook(bookId,userId);
        }
    }
}
