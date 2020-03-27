package java.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BookStoreRepo {
    //  private static Map<Integer,Book> booklist=new HashMap<>();
    private static Map<Integer, Author> authorList = new HashMap<>();

    public static void put(Author author) {
        if (!authorList.containsKey(author.getId())) {
            authorList.put(author.getId(), author);
        }
    }

//    public static void delete(int id) {
//        if (!authorList.containsKey(id)) {
//            authorList.remove(id);
//        }
//    }
//
//    public static void update(int id, Author author) {
//        if (!authorList.containsKey(id)) {
//            authorList.put(id, author);
//        }
//    }

//    public static Author getById(int id) {
//        return authorList.get(id);
//    }
//
//
//    public static Map<Integer, Author> getAuthorList() {
//        return authorList;
//    }
//
//
//    public static boolean containsAuthor(Author author) {
//       return authorList.containsValue(author);
//    }
}
