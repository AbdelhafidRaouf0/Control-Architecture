package com.example.ctrl.dao.repository;

import com.example.ctrl.dao.repository.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository <Book,Long> {
}
