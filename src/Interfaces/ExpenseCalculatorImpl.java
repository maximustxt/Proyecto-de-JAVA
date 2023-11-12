package Interfaces;

import Interfaces.ExpenseCalculator;
import Entities.Expense;

import java.util.List;
import java.util.stream.Stream;

public class ExpenseCalculatorImpl implements ExpenseCalculator {
    @Override
    public double ClaculateExpense(Expense expense) {
        return expense.getAmount();
    }

    @Override
    public double CalculateTotalExpense(List<Expense> expenses) {
        double totalExpense = 0;
             for(Expense expense : expenses){
                    totalExpense = totalExpense + expense.getAmount();
             }
                    return totalExpense;
         }
    }
