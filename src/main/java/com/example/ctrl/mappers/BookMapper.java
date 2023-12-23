package com.example.ctrl.mappers;

import com.example.ctrl.dtos.BookDTO;
import com.example.ctrl.dao.repository.entities.Book;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

        private final ModelMapper modelMapper = new ModelMapper();

        public BookDTO fromPersonToPersonDto(Book book) {
            return this.modelMapper.map(book, BookDTO.class);
        }

        public Book fromPersonDtoToPerson(BookDTO bookDto) {
            return this.modelMapper.map(bookDto, Book.class);
        }
    }
