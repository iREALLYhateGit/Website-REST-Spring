package ru.ldinka.personal.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ldinka.personal.repositories.AccountRep;

@Controller
public class MainPage {
    @Autowired
    AccountRep rep;
    Integer counter;
    @GetMapping("/")
    public String getMain(Model model, HttpServletRequest request){
        model.addAttribute("accounts", rep.findAll());
        HttpSession session = request.getSession();
        counter = (Integer) session.getAttribute("counter");
        if(counter == null)
            counter = 1;
        else
            counter++;
        session.setAttribute("counter",counter);
        model.addAttribute("counter", counter);
        return "main_page";
    }
//    @PostMapping("/post")
//    public void postPage(){
//        i = 24;
//    }
}
