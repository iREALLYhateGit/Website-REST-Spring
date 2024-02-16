package ru.ldinka.personal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ldinka.personal.models.Account;

import java.util.List;

public interface AccountRep extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
}
