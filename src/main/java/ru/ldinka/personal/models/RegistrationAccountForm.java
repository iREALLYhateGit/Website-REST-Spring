package ru.ldinka.personal.models;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import ru.ldinka.personal.repositories.AccountRep;
import ru.ldinka.personal.repositories.BooksRep;

import javax.validation.Valid;
import java.awt.print.Book;

@Validated

public record RegistrationAccountForm(Long id, @Valid String email, String password) {

}
