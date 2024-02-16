package ru.ldinka.personal.models;

public class AccountAlreadyExistException extends RuntimeException{
    public AccountAlreadyExistException(String message) {
        super(message);
    }
}
