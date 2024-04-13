package in.harshita.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.harshita.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
