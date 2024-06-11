package com.nv.libraryweb.repository;

import com.nv.libraryweb.entity.Book;
import com.nv.libraryweb.entity.Loan;
import com.nv.libraryweb.entity.Member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByMember(Member member);

    Optional<Loan> findByBookAndReturnDateIsNull(Book book);
}
