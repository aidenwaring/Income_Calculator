import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the name for the new employee you wish to be entered.");
        String name = scanner.nextLine();

        System.out.println("Provide a number (double value) that represents the user's annual salary.");
        double salary = scanner.nextDouble();

        double calculatedTax = taxCalculation(salary);
        double calculatedSuper = superCalculation(salary);

        System.out.printf("Name: %s | Salary: %s | Taxable Income: %s | SG Superannuation Contribution %s",
                name,
                salary,
                calculatedTax,
                calculatedSuper);
    }

    static double taxCalculation(double salary) {
        double tax = 0;

        if (salary <= 18200) {
            return tax;
        } else if (salary <= 37000) {
            tax = (salary - 18200) * 0.19;
        } else if (salary <= 90000) {
            tax = 3572 + (salary - 37000) * 0.325;
        } else if (salary <= 180000) {
            tax = 20797 + (salary - 90000) * 0.37;
        } else {
            tax = 54097 + (salary - 180000) * 0.45;
        }
        return tax;
    }

    static double superCalculation(double salary) {
        return salary * 0.105;
    }
}