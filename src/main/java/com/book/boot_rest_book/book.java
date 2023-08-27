package com.book.boot_rest_book;

public class book {
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public book() {
    }
    @Override
    public String toString() {
        return "book [id=" + id + ", name=" + name + ", number=" + number + "]";
    }
    private int id;
    public book(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    private String number;

}
