package java.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;


@Service
public class BookStoreService {

    @Bean
    public static Author createAuthor(String name, String surname) {
        Author author = new Author(name, surname);
        BookStoreRepo.put(author);
        return new Author(name, surname);
    }
//
//    public static Author deleteAuthor(@RequestParam("name") String name, @RequestParam("surname") String surname) {
//        Author author = new Author(name, surname);
//        if(BookStoreRepo.containsAuthor(author))
//        BookStoreRepo.delete(author);
//        return new Author(name, surname);
//    }
//
//    public static Author getById(int id){
//        return BookStoreRepo.getById(id);
//    }

}
