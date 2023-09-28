package ru.ldinka.personal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.repositories.AccountRep;

@Controller
@RequestMapping("/signIn")
public class SignIn {

    @Autowired
    AccountRep accountRep;


    @GetMapping("")
    public String getSignIn(){
        return "signIn_page";
    }

    @PostMapping("/createUser")
    public String createUser(Account account){
        accountRep.save(account);
        return "redirect:/";
    }
}
