package com.nk.tx.service;

import com.nk.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

//只读
//@Transactional(readOnly = true)

//超时
//@Transactional(timeout = 3)

//回滚策略
//@Transactional(noRollbackFor = ArithmeticException.class)

//隔离级别
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
//        根据图书id查询图书价格
        Integer price = bookDao.getBookPriceById(bookId);

//        更新图书表库存-1
        bookDao.updateStock(bookId);

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        int i = 1/0;

//        更新用户余额
        bookDao.updateUserBalance(userId,price);

    }
}
