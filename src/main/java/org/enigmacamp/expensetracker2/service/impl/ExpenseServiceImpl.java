package org.enigmacamp.expensetracker2.service.impl;

import org.enigmacamp.expensetracker2.model.entity.Expense;
import org.enigmacamp.expensetracker2.repository.ExpenseRepository;
import org.enigmacamp.expensetracker2.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpensesByUserId(String userId) {
        return expenseRepository.findByUserId(userId).stream()
                .filter(expense -> expense.getUser().getId() == userId)
                .collect(Collectors.toList());
    }

    public Double getTotalAmountByUserId(String userId) {
        return expenseRepository.getTotalAmountByUserId(userId);
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }
}