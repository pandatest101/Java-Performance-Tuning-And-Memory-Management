package com.art.warmup.jit.statements.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for StatementDataConfig
 */
@SpringBootTest
class StatementDataConfigTest {
    
    @Autowired
    private StatementDataConfig config;
    
    @Test
    void testConfigurationLoading() {
        assertNotNull(config, "Configuration should be loaded");
        
        // Test basic configuration values
        assertEquals(50, config.getRecordCount(), "Record count should be 50");
        assertEquals(5000.0, config.getInitialBalance(), "Initial balance should be 5000.0");
        assertEquals(100.0, config.getMinIncomeAmount(), "Min income amount should be 100.0");
        assertEquals(5000.0, config.getMaxIncomeAmount(), "Max income amount should be 5000.0");
        assertEquals(50.0, config.getMinOutcomeAmount(), "Min outcome amount should be 50.0");
        assertEquals(2000.0, config.getMaxOutcomeAmount(), "Max outcome amount should be 2000.0");
    }
    
    @Test
    void testIncomeCategories() {
        assertNotNull(config.getIncomeCategories(), "Income categories should not be null");
        assertFalse(config.getIncomeCategories().isEmpty(), "Income categories should not be empty");
        assertTrue(config.getIncomeCategories().contains("Salary"), "Should contain Salary category");
        assertTrue(config.getIncomeCategories().contains("Bonus"), "Should contain Bonus category");
    }
    
    @Test
    void testOutcomeCategories() {
        assertNotNull(config.getOutcomeCategories(), "Outcome categories should not be null");
        assertFalse(config.getOutcomeCategories().isEmpty(), "Outcome categories should not be empty");
        assertTrue(config.getOutcomeCategories().contains("Groceries"), "Should contain Groceries category");
        assertTrue(config.getOutcomeCategories().contains("Utilities"), "Should contain Utilities category");
    }
    
    @Test
    void testIncomeDescriptions() {
        assertNotNull(config.getIncomeDescriptions(), "Income descriptions should not be null");
        assertFalse(config.getIncomeDescriptions().isEmpty(), "Income descriptions should not be empty");
        assertTrue(config.getIncomeDescriptions().contains("Monthly Salary Payment"), 
                  "Should contain Monthly Salary Payment description");
    }
    
    @Test
    void testOutcomeDescriptions() {
        assertNotNull(config.getOutcomeDescriptions(), "Outcome descriptions should not be null");
        assertFalse(config.getOutcomeDescriptions().isEmpty(), "Outcome descriptions should not be empty");
        assertTrue(config.getOutcomeDescriptions().contains("Supermarket Purchase"), 
                  "Should contain Supermarket Purchase description");
    }
    
    @Test
    void testAmountRanges() {
        assertTrue(config.getMinIncomeAmount() < config.getMaxIncomeAmount(), 
                  "Min income should be less than max income");
        assertTrue(config.getMinOutcomeAmount() < config.getMaxOutcomeAmount(), 
                  "Min outcome should be less than max outcome");
        assertTrue(config.getMinIncomeAmount() > 0, "Min income should be positive");
        assertTrue(config.getMinOutcomeAmount() > 0, "Min outcome should be positive");
    }
}
