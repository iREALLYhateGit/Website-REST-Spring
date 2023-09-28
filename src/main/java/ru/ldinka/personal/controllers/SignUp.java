package ru.ldinka.personal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.repositories.AccountRep;

import java.util.List;

@Controller
@RequestMapping("/signUp")
public class SignUp {

    @Autowired
    private AccountRep accountRep;

    @GetMapping("")
    public String getPage(Model model){
        List<Account> accountsList = accountRep.findAll();
        model.addAttribute("accounts", accountsList);
        return "signUp_page";
    }

    @PostMapping("/createUser")
    public String createUser(Account account){
        accountRep.save(account);
        //public String createUser(@RequestParam(value = "id",required = false) Long k,@RequestParam(value = "name") String f, @RequestParam(value = "password") String z){
        //System.out.println(k + " " + f + " " + z);
        return "redirect:/";
    }


}
