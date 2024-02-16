package ru.ldinka.personal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String roleName;

    @OneToMany
    @JoinColumn(name = "role_id")
    private ArrayList<Uzer> arr = new ArrayList<>();
}
