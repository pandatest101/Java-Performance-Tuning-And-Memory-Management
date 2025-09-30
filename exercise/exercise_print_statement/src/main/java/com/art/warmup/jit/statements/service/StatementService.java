package com.art.warmup.jit.statements.service;

import com.art.warmup.jit.statements.config.StatementData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatementService {

    private StatementData statementData;

    @Autowired
    public StatementService(StatementData statementData) {
        this.statementData = statementData;
    }

    public String printStatement(){
        String statementPDF = "";
        statementPDF += "Date | Income | Expense | Balance\n";

        for (int i = 0; i < statementData.getTransactions().size(); i++) {
            statementPDF += statementData.getTransactions().get(i).getDatetime() + " | " + statementData.getTransactions().get(i).getIncome() + " | " + statementData.getTransactions().get(i).getExpense() + " | " + statementData.getTransactions().get(i).getBalance() + "\n";
        }

        return statementPDF;
    }

}
