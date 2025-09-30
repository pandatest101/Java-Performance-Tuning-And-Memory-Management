package com.art.warmup.jit.statements.controller;

import com.art.warmup.jit.statements.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/statement")
public class StatementController {

    private final StatementService statementService;

    @Autowired
    public StatementController(StatementService statementService) {
        this.statementService = statementService;
    }


    @GetMapping("/pdf")
    public ResponseEntity<String> generateStatementPdf() {

       return new ResponseEntity<>(statementService.printStatement(),HttpStatus.OK);
    }

}
