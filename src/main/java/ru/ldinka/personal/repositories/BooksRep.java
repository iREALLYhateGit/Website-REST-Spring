package ru.ldinka.personal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ldinka.personal.models.Books;

public interface BooksRep extends JpaRepository<Books,Long> {
}
