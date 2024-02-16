package ru.ldinka.personal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ldinka.personal.models.Account;
import ru.ldinka.personal.repositories.AccountRep;
import ru.ldinka.personal.repositories.BooksRep;

@Service
public class BookRate {
    @Autowired
    AccountRep accountRep;

    @Autowired
    BooksRep booksRep;
    

}
