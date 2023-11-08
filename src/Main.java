import Entities.Expense;
import Entities.ExpenseCategory;
import Interfaces.ExpenseCalculator;
import Interfaces.ExpenseCalculatorImpl;
import Interfaces.ExpensesAmountValidators;
import Interfaces.ExpensesAmountValidatorsImpl;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static  int counter = 0;

    public static void main(String[] args) {
        ExpensesAmountValidators expensesAmountValidators = new ExpensesAmountValidatorsImpl();
        ExpenseCalculator expenseCalculator = new ExpenseCalculatorImpl();

        //* MAPA QUE VA A CONTENER EL CONTADOR :
        Map<String,Integer> contador = new HashMap<>();

        String Date;
        String NombreDelGasto;
        boolean iswrongType = false;
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int amountOfExpenses = 0;
        double amount;

        do{
            System.out.print("Por favor ingrese una cantidad de gastos :");
            if(scanner.hasNextInt()){
                amountOfExpenses = scanner.nextInt();
            } else {
                System.out.println("Dato erroneo !");
            }
        }while (iswrongType);

        System.out.println("\n");

        //* ARRAY DE GASTOS :
       List<Expense> arrayOfExpenses = new ArrayList<>();



        do{
            Expense expense = new Expense();
            ExpenseCategory expenseCategory = new ExpenseCategory();


            System.out.println("------------------------------------"+ " " + "GASTO " + (index + 1) + " : " + "---------------------------------");



            System.out.print("Ingresar la fecha del gasto (DD/MM/YYYY) : ");
            Integer date = scanner.nextInt();
            expense.setDate(date);

            scanner.nextLine();
            System.out.print("Agregar El nombre del gasto N°" + (index + 1) + " : " );
            NombreDelGasto = scanner.nextLine().toLowerCase().trim();
            expenseCategory.setName(NombreDelGasto);
            contador.put(NombreDelGasto, index);

            System.out.print("Ingresas El Monto del Gasto N°" + (contador.get(NombreDelGasto) + 1) + ": ");

            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
            } else {
                System.out.println("Error en el dato ingresado, debes ingresar un número válido.");
                scanner.nextLine();;  // Consume the invalid input.
                continue;  // Continue the loop to re-enter the valid input.
            }

            expense.setId(counter);
            expense.setAmount(amount);
            expense.setCategory(expenseCategory);




            //* Guardamos el gasto en la lista :
            arrayOfExpenses.add(expense);

            counter++;
            index++;

        }while (index < amountOfExpenses);


        System.out.println("\n");

        System.out.println("\n---------------- DETALLES DE LOS GASTOS ----------------");

        for (Expense expense : arrayOfExpenses){
            System.out.println("++++++++++++++++++++++++++ " + (expense.getId() + 1) + " ++++++++++++++++++++++++++");
            System.out.println("Nombre del gasto: " + expense.getCategory().getName());
            System.out.println("Monto del gasto: " + "$ " + expense.getAmount());
            System.out.println("Fecha del gasto: " + expense.getDate());
        }


        System.out.println("----------------------------------------------------------");

        System.out.println("\n");

        System.out.print("TOTAL DE GASTOS INGRESADOS : ");
        System.out.println("$ " + expenseCalculator.CalculateTotalExpense(arrayOfExpenses));


    }
}