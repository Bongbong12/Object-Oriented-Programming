package com.nv.libraryweb.repository;


import com.nv.libraryweb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
