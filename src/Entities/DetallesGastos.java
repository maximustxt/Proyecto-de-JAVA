package Entities;

import java.util.List;
import java.util.stream.Stream;

public class DetallesGastos<T> {
    public void  MostrarDetalleDeGastos(List<? extends Expense> ListaDeGastos){
        Stream<? extends Expense> ExpenseStream = ListaDeGastos.stream();

        System.out.println("\n");

        System.out.println("\n---------------- DETALLES DE LOS GASTOS ----------------");

        ExpenseStream.forEach(expense -> {
            System.out.println("++++++++++++++++++++++++++ " + (expense.getId() + 1) + " ++++++++++++++++++++++++++");
            System.out.println("Nombre del gasto: " + expense.getCategory().getName());
            System.out.println("Monto del gasto: " + "$ " + expense.getAmount());
            System.out.println("Fecha del gasto: " + expense.getDate());
        });


        System.out.println("----------------------------------------------------------");

        System.out.println("\n");
    }
}
