package Exception;

public class ExceptionExpensesValidator extends  Exception {
    // Para que una clase sea una exception debe extender de la clase exception!.

public ExceptionExpensesValidator(String message){
    // Implementamos super que hereda de la clase Exception!.
    super(message);
}

}
