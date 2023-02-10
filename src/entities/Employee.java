package entities;

public class Employee {

    private String name;

    private double salary;

    private double tax;

    private double superannuation;

    public Employee() {
    }

    private String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private double getTax() {
        return tax;
    }

    private double getSuperannuation() {
        return superannuation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setSuperannuation(double superannuation) {
        this.superannuation = superannuation;
    }

    public void displayInfo() {
        System.out.printf(
                "Name: %s | Salary: %s | Taxable Income: %s | SG Superannuation Contribution %s",
                getName(),
                getSalary(),
                getTax(),
                getSuperannuation()
        );
    }
}
