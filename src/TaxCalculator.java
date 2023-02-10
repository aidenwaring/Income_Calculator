import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number (double value) that represents the user's annual salary.");

        double salary = scanner.nextDouble();

        System.out.println(taxCalculation(salary));
    }

    private static double taxCalculation(double salary) {
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
}