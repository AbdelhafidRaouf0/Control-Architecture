package com.example.ctrl.service;

import com.example.ctrl.dtos.BookDTO;

public abstract class BookManagerDependence {
    public static BookDTO getBookById(Long id) {
        return null;
    }

    public BookDTO saveBook(BookDTO bookDTO) {
        return null;
    }

    public abstract BookDTO getPersonById(Long id);

    public abstract BookDTO savePerson(BookDTO personDto);
}
