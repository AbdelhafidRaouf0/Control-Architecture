package com.example.ctrl.web;

import com.example.ctrl.dtos.BookDTO;
import com.example.ctrl.service.BookManagerDependence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookGrapheQLController {

    @Autowired
    private BookManagerDependence bookManagerDependence;

    @QueryMapping
    public BookDTO getbookById(@Argument Long id) {
        return BookManagerDependence.getBookById(id);
    }

    @MutationMapping
    public BookDTO savePerson(BookDTO bookDto) {
        return bookManagerDependence.saveBook(bookDto);
}
}


