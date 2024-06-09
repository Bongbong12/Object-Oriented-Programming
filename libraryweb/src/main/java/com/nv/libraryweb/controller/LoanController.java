package com.nv.libraryweb.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nv.libraryweb.entity.Loan;
import com.nv.libraryweb.service.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }

    @PostMapping
    public ResponseEntity<?> createLoan(@RequestBody Loan loan) {
        try {
            Loan createdLoan = loanService.createLoan(loan);
            return ResponseEntity.ok(createdLoan);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PutMapping("/return/{id}")
    public Loan returnLoan(@PathVariable Long id) {
        return loanService.returnLoan(id);
    }

    @GetMapping("/member/{memberId}")
    public List<Loan> getLoansByMember(@PathVariable Long memberId) {
        Member member = new Member();
        member.setId(memberId);
        return loanService.getLoansByMember(member);
    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }
}