import java.util.*;

abstract class Day_13_book {
    String title;
    String author;
    
    Day_13_book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}