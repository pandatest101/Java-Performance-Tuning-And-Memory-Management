package com.art.warmup.jit.statements.config;

import com.art.warmup.jit.statements.model.Transaction;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Configuration class for statement data
 */
@Configuration
public class StatementData {
    List<Transaction> transactions;
    
    @PostConstruct
    private void setup(){
        transactions = new ArrayList<>();
        Transaction t1 = new Transaction("2025-08-11", "1000.00", "0.00", "1000.00");
        transactions.add(t1);
        for (int i = 0; i < 20000; i++) {
            if (i % 2 == 0){
                t1 = new Transaction("2025-08-11", "0.00", String.format("%d.2f",i), String.format("%d.2f",i));
            } else {
                t1 = new Transaction("2025-08-11", String.format("%d.2f",i), "0.00", String.format("%d.2f",i));
            }
            transactions.add(t1);
        }

    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
