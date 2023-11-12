package Entities;

public class Expense {

    private int id;
    private double amount;
    private ExpenseCategory category;

    private String date;


    public Expense() {
    }

    public Expense(int id, double amount, ExpenseCategory category, String date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseCategory getCategory() {
        return this.category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Gastos{" +
                "ID=" + id +
                ", Amount=" + amount +
                ", Category=" + category +
                ", Date='" + date + '\'' +
                '}';
    }
}
