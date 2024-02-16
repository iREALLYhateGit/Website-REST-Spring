package ru.ldinka.personal.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.models.RegistrationAccountForm;
import ru.ldinka.personal.repositories.AccountRep;
import ru.ldinka.personal.services.AccountService;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequestMapping("/signIn")
@Validated
public class SignIn {

    @Autowired
    AccountRep accountRep;

    @Autowired
    AccountService accService;


    @GetMapping("")
    public String getSignIn(Account account){
        return "signIn_page";
    }

    @PostMapping("/registerAccount")
    public void createUser(@Valid RegistrationAccountForm form, HttpServletRequest req,
                           HttpServletResponse response) throws IOException, ServletException {

        accService.registerAccount(form);

        System.out.println(req.getMethod());
        System.out.println(response.getStatus());
        response.sendRedirect("/");
//        req.getServletContext().getRequestDispatcher("/").forward(req,response);
//        return "redirect:/";
    }
}

//regular expressions
