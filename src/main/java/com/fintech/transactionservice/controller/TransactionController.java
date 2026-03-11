package com.fintech.transactionservice.controller;

import com.fintech.transactionservice.dto.TransactionRequest;
import com.fintech.transactionservice.model.Transaction;
import com.fintech.transactionservice.service.TransactionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping("/deposit")
    public Transaction deposit(@RequestBody TransactionRequest request) {

        return service.deposit(
                request.getAccountId(),
                request.getAmount()
        );
    }

    @PostMapping("/withdraw")
    public Transaction withdraw(@RequestBody TransactionRequest request) {

        return service.withdraw(
                request.getAccountId(),
                request.getAmount()
        );
    }

    @GetMapping("/{accountId}")
    public List<Transaction> history(@PathVariable String accountId) {

        return service.getTransactions(accountId);
    }
}