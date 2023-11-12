import Entities.DetallesGastos;
import Entities.Expense;
import Entities.ExpenseCategory;
import Interfaces.ExpenseCalculator;
import Interfaces.ExpenseCalculatorImpl;
import java.util.*;

public class Main {

    public static  int counter = 0;

    public static void main(String[] args) {
        ExpenseCalculator expenseCalculator = new ExpenseCalculatorImpl();

        //* INSTANCIA DE CLASE GENERICA :
        DetallesGastos<Expense> detallesGastos = new DetallesGastos<>();
        //* MAPA QUE VA A CONTENER EL CONTADOR :
        Map<String,Integer> contador = new HashMap<>();
        String NombreDelGasto;
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        double amount;
        String date;


        System.out.println("\n");

        //* ARRAY DE GASTOS :
        List<Expense> arrayOfExpenses = new ArrayList<>();

        // Variable para controlar el bucle
        char respuesta;

        //*- Bucle while para permitir ingreso de gastos mientras el usuario lo desee :




        while (true) {
            // Preguntar al usuario si desea agregar otro gasto
            System.out.print("¿Desea agregar otro gasto? (SI/NO): ");
            respuesta = scanner.next().charAt(0);

            // Salir del bucle si la respuesta no es 'S' (SI)
            if (respuesta != 'S') {
                break;
            }

            Expense expense = new Expense();
            ExpenseCategory expenseCategory = new ExpenseCategory();

            System.out.println("------------------------------------" + " " + "GASTO " + (index + 1) + " : " + "---------------------------------");

            // Limpiar el búfer después de la entrada anterior :
            scanner.nextLine();

            System.out.print("Ingresar la fecha del gasto (DD/MM/YYYY) : ");
            date = scanner.nextLine();
            expense.setDate(date);

            System.out.print("Agregar El NOMBRE del Gasto N°" + (index + 1) + " : ");
            NombreDelGasto = scanner.nextLine().toLowerCase().trim();
            expenseCategory.setName(NombreDelGasto);
            contador.put(NombreDelGasto, index);

            System.out.print("Ingresas El MONTO del Gasto N°" + (contador.get(NombreDelGasto) + 1) + ": ");

            if (scanner.hasNextDouble()) {
                amount = scanner.nextDouble();
                if (amount == 0) {
                    System.out.println("Debes ingresar un gasto que sea mayor a 0!");
                    continue;
                }
            } else {
                System.out.println("Error en el dato ingresado, debes ingresar un número válido.");
                scanner.nextLine();
                continue;
            }

            // Limpiar el búfer después de la entrada del número :
            scanner.nextLine();

            expense.setId(counter);
            expense.setAmount(amount);
            expense.setCategory(expenseCategory);

            // Guardamos el gasto en la lista :
            arrayOfExpenses.add(expense);

            counter++;
            index++;
        }


        //* DETALLES DE LOS GASTOS :

        if(expenseCalculator.CalculateTotalExpense(arrayOfExpenses) == 0){
            System.out.println("\n");
            System.out.println("🛑 NO HAY GASTOS 🛑");
            System.out.println("\n");
        } else {
            detallesGastos.MostrarDetalleDeGastos(arrayOfExpenses);
            System.out.print("TOTAL DE GASTOS INGRESADOS : ");
            System.out.println("$ " + expenseCalculator.CalculateTotalExpense(arrayOfExpenses));
        }


    }
}