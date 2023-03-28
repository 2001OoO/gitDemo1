package com.nk.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        set方法注入属性值
        Book book = new Book();
        book.setAuthor("nk");
        book.setBname("java spring6");

//        构造器注入属性值
        Book book1 = new Book("java spirng6", "nk2");;
        System.out.println(book1.author);
    }
}
