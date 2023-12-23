package com.example.ctrl;
import com.example.ctrl.dao.repository.entities.Book;
import com.example.ctrl.dao.repository.Bookrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}
	@Bean
	CommandLineRunner start(Bookrepository bookRepository) {
		return args -> {
			List<Book> books = Arrays.asList(
					Book.builder().titre("Title1").publisher("Publisher1").price(19.99f).date_publication(LocalDate.of(2022, 1, 1)).resume("Summary1").build(),
					Book.builder().titre("Title2").publisher("Publisher2").price(29.99f).date_publication(LocalDate.of(2022, 2, 1)).resume("Summary2").build(),
					Book.builder().titre("Title3").publisher("Publisher3").price(39.99f).date_publication(LocalDate.of(2022, 3, 1)).resume("Summary3").build(),
					Book.builder().titre("Title4").publisher("Publisher4").price(49.99f).date_publication(LocalDate.of(2022, 4, 1)).resume("Summary4").build()
			);
			bookRepository.saveAll(books);
		};
	}
}
