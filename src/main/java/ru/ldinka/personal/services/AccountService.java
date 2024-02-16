package ru.ldinka.personal.services;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.models.AccountAlreadyExistException;
import ru.ldinka.personal.models.RegistrationAccountForm;
import ru.ldinka.personal.repositories.AccountRep;

import java.beans.Encoder;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRep accountRep;
    private final JavaMailSender sender;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private Account baseAccount;

    public void registerAccount(RegistrationAccountForm form){

        baseAccount = accountRep.findByEmail(form.email());
        if(isAccountExist()){
            if(isPassedSignIn(form))
                System.out.println("Signed in");
            else
                System.out.println("Try more");
        }
        else{
            System.out.println("Want to create an account?");
            System.out.println("get your message");
        }
    }
    public void createAccount(RegistrationAccountForm form, HttpServletRequest request,
                              HttpServletResponse response) throws IOException {

        baseAccount = accountRep.findByEmail(form.email());
        if(isAccountExist()){
            //throw new AccountAlreadyExistException("Account with such email is already exists");
            System.out.println("Such account exists, maybe you wANT TO signIn?");
            response.sendRedirect("/signIn");
        }
        else{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("artyomprogeimer@gmail.com");
            message.setTo("klassnyjartem8@gmail.com");
            message.setText("Click to create an account");
            sender.send(message);
            // checking and verification
            var newAccount = new Account();
            newAccount.setEmail(form.email());
            newAccount.setPassword(encoder.encode(form.password()));
            accountRep.save(newAccount);
            System.out.println(request.getSession().getCreationTime());
        }
    }
    private boolean isAccountExist(){
        return baseAccount != null;
    }
   private boolean isPassedSignIn(RegistrationAccountForm form){
        return baseAccount.getPassword().equals(encoder.encode(form.password()));
    }
}
