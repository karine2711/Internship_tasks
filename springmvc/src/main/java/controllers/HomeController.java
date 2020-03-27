package java.controllers;

import java.model.Author;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.model.BookStoreService;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "index";
    }


    // @ResponseBody

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createAuthor(@RequestParam("name") String name, @RequestParam("surname") String surname, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Author author = BookStoreService.createAuthor(name, surname);
        request.setAttribute("author", author);
        return "index";
    }

//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public String delete() {
//        Author author = BookStoreService.createAuthor()
//    }


}
