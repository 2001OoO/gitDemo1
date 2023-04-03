package com.nk.tx.dao;

public interface BookDao {
    Integer getBookPriceById(Integer bookId);

    void updateStock(Integer bookId);

    void updateUserBalance(Integer userId,Integer price);
}
