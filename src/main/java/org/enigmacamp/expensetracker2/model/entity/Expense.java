package org.enigmacamp.expensetracker2.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String description;

    private double amount;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // getters and setters
}
