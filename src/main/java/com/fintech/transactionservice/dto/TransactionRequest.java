package com.fintech.transactionservice.dto;

public class TransactionRequest {

    private String accountId;
    private double amount;

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

}