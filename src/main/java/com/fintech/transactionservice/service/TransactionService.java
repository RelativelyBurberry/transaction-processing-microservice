package com.fintech.transactionservice.service;

import com.fintech.transactionservice.model.Transaction;
import com.fintech.transactionservice.model.TransactionType;
import com.fintech.transactionservice.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Transaction deposit(String accountId, double amount) {

        Transaction transaction =
                new Transaction(accountId, amount, TransactionType.DEPOSIT);

        return repository.save(transaction);
    }

    public Transaction withdraw(String accountId, double amount) {

        double balance = getBalance(accountId);

        if (balance < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        Transaction transaction =
                new Transaction(accountId, amount, TransactionType.WITHDRAWAL);

        return repository.save(transaction);
    }

    public List<Transaction> getTransactions(String accountId) {
        return repository.findByAccountId(accountId);
    }

    public double getBalance(String accountId) {

        List<Transaction> transactions = repository.findByAccountId(accountId);

        double balance = 0;

        for (Transaction t : transactions) {

            if (t.getType() == TransactionType.DEPOSIT) {
                balance += t.getAmount();
            }

            if (t.getType() == TransactionType.WITHDRAWAL) {
                balance -= t.getAmount();
            }
        }

        return balance;
    }
}