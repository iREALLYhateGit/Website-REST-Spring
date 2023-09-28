package ru.ldinka.personal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ldinka.personal.models.Account;

public interface AccountRep extends JpaRepository<Account, Long> {
}
