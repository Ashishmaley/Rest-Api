package com.book.boot_rest_book.BookService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.book.boot_rest_book.book;
@Component
public class service {
    public static List<book> item = new ArrayList<>();
    static {
        item.add(new book(0, "ashish maley", "7879458638"));
        item.add(new book(1, "ateet", "9993530985"));
        item.add(new book(2, "ashey", "12324324..."));
        item.add(new book(3, "asley", "12112..."));
        item.add(new book(4, "ashi", "78794xxxx"));
        item.add(new book(5, "ayw", "787945xxx"));
        item.add(new book(6, "amaley", "78794xxxxx"));
    }

    public List<book> getAllbooks() {
        return item;
    }
    
    public book getOne(int id) {
        book b=null;
        b=item.stream().filter(e->e.getId()==id).findFirst().get();
        return b;
    }
}
