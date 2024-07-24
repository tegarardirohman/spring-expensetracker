package org.enigmacamp.expensetracker2.controller;

import org.enigmacamp.expensetracker2.model.entity.Expense;
import org.enigmacamp.expensetracker2.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/{userId}")
    public List<Expense> getExpensesByUserId(@PathVariable String userId) {
        return expenseService.getExpensesByUserId(userId);
    }

    @GetMapping("/total-amount/{userId}")
    public Double getTotalAmountByUserId(@PathVariable String userId) {
        return expenseService.getTotalAmountByUserId(userId);
    }

    @PostMapping
    public Expense saveExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable String id) {
        expenseService.deleteExpense(id);
    }
}
