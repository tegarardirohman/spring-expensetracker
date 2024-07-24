package org.enigmacamp.expensetracker2.service;

import org.enigmacamp.expensetracker2.model.entity.Expense;

import java.util.List;

public interface ExpenseService {

    public List<Expense> getExpensesByUserId(String userId);

    public Double getTotalAmountByUserId(String userId);

    public Expense saveExpense(Expense expense);

    public void deleteExpense(String id);
}
