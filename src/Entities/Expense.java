package Entities;

public class Expense {

    private int id;
    private double amount;
    private ExpenseCategory category;

    private Integer date;


    public Expense() {
    }

    public Expense(int id, double amount, ExpenseCategory category, Integer date) {
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

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
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
