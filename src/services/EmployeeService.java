package services;

import entities.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeService {

    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        validateEmployeeName(scanner, employee);
        validateEmployeeSalary(scanner, employee);

        double calculatedTax = TaxSuperCalculatorHelper.taxCalculation(employee.getSalary());
        double calculatedSuper = TaxSuperCalculatorHelper.superCalculation(employee.getSalary());

        employee.setTax(calculatedTax);
        employee.setSuperannuation(calculatedSuper);
        employee.displayInfo();
    }

     public static void validateEmployeeName(Scanner scanner, Employee employee) {
        try {
            System.out.println("Please provide the name for the new employee and hit 'Enter'.");
            employee.setName(scanner.nextLine());
        } catch (IllegalStateException e) {
            System.out.println("Error: Input scanner unexpectedly closed. Please try again.");
        }
    }

    public static void validateEmployeeSalary(Scanner scanner, Employee employee) {
        try {
            System.out.println("Please provide the annual salary for the new employee and hit 'Enter'.");
            employee.setSalary(scanner.nextDouble());
        } catch (InputMismatchException | IllegalStateException e) {
            System.out.println("Error: Invalid input. Please re-run program and provide a valid salary value.");
        }
    }
}