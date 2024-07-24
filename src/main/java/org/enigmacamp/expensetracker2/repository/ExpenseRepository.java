package org.enigmacamp.expensetracker2.repository;

import org.enigmacamp.expensetracker2.model.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, String> {

    @Query(value = "SELECT * FROM expenses WHERE user_id = :userId", nativeQuery = true)
    List<Expense> findByUserId(@Param("userId") String userId);

    @Query(value = "SELECT SUM(amount) FROM expenses WHERE user_id = :userId", nativeQuery = true)
    Double getTotalAmountByUserId(@Param("userId") String userId);
}
