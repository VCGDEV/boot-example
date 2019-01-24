package com.example.domain;

import javax.persistence.*;

@Entity
public class Book {
    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
}
