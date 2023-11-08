package Interfaces;

import Interfaces.ExpensesAmountValidators;

import Exception.ExceptionExpensesValidator;

public class ExpensesAmountValidatorsImpl implements ExpensesAmountValidators {
    @Override
    public boolean notValidAmount(double amount) throws ExceptionExpensesValidator {
        if (amount <= 0) {
            throw new ExceptionExpensesValidator("El monto debe ser mayor a 0");
        }
        return false;
    }
}
