package ru.ldinka.personal.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.models.RegistrationAccountForm;
import ru.ldinka.personal.repositories.AccountRep;
import ru.ldinka.personal.services.AccountService;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/signUp")
public class SignUp {

    @Autowired
    private AccountRep accountRep;

    @Autowired
    private AccountService accountService;

    @Autowired
    private JavaMailSender sender;

    @GetMapping("")
    public String getPage(Model model){
        List<Account> accountsList = accountRep.findAll();
        model.addAttribute("accounts", accountsList);
        return "signUp_page";
    }

    public String verifyEmail(){
        return "verify_page";
    }

    @PostMapping("/verifyEmail")
    public String verifyEmail(String email,HttpServletRequest request){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("linklink");
        message.setTo("klassnyjartem8@gmail.com");
        sender.send(message);
        return "redirect:/signUp/verifyEmail";
    }

    @PostMapping("/createAccount")
    public String createUser(RegistrationAccountForm form, HttpServletRequest request,
                             HttpServletResponse response) throws IOException {

        accountService.createAccount(form, request, response);
        return "redirect:/";
    }


}
