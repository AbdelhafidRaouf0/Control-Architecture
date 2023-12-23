package com.example.ctrl.dao.repository.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id_book;
    private String titre;
    private String publisher;
    private LocalDate date_publication;
    private float price;
    private String resume;
}
