package Interfaces;

import Entities.Expense;

import java.util.List;

public interface ExpenseCalculator {
    double ClaculateExpense(Expense expense);
    double CalculateTotalExpense(List<Expense> expenses);
}
