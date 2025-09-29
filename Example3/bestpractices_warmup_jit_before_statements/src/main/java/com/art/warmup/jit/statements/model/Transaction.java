package com.art.warmup.jit.statements.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Transaction model representing individual financial transactions
 */
public class Transaction {
    
    String datetime;
    String income;
    String expense;
    String balance;

    public Transaction(String datetime, String income, String expense, String balance) {
        this.datetime = datetime;
        this.income = income;
        this.expense = expense;
        this.balance = balance;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getIncome() {
        return income;
    }

    public String getExpense() {
        return expense;
    }

    public String getBalance() {
        return balance;
    }
}
