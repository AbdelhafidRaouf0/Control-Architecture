package com.example.ctrl.service;

import com.example.ctrl.dtos.BookDTO;
import com.example.ctrl.mappers.BookMapper;
import com.example.ctrl.dao.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookManager extends BookManagerDependence {

        @Autowired
        private Bookrepository bookrepository;
        @Autowired
        private BookMapper bookMapper;
        @Override
        public BookDTO getPersonById(Long id) {
            return bookMapper.fromPersonToPersonDto(bookrepository.findById(id).get());
        }
        @Override
        public BookDTO savePerson(BookDTO personDto) {
            return bookMapper.fromPersonToPersonDto(bookrepository.save(bookMapper.fromPersonDtoToPerson(personDto)));

        }
}
