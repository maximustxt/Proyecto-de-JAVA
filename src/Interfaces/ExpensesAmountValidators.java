package Interfaces;

import Exception.ExceptionExpensesValidator;
@FunctionalInterface
public interface ExpensesAmountValidators {
    boolean notValidAmount(double amount) throws ExceptionExpensesValidator;
}
