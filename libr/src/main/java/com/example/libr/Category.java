package com.example.libr;

import javax.persistence.*;

@Entity
@Table (name = "categories")


public class Category {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(nullable = false)
    public  String name;
}
