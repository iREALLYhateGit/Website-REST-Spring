package ru.ldinka.personal.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;

@Entity
@Data
@NoArgsConstructor
public class Uzer {
    public Uzer(@NonNull String login, @NonNull String password){
        this.login = login;
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String login;

    @Column
    @NonNull
    private String password;

    @Column
    @Email
    private String email;

    /*@NonNull
    @ManyToOne
    private Role role;*/

    public void addRole(Role role){
        role.getArr().add(new Uzer("login","password"));
    }
}
