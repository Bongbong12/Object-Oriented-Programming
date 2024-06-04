package com.bongbong.library.repository;

import com.bongbong.library.entity.Book;
import com.bongbong.library.entity.Loan;
import com.bongbong.library.entity.Member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByMember(Member member);

    Optional<Loan> findByBookAndReturnDateIsNull(Book book);
}