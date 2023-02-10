import entities.Employee;
import org.junit.jupiter.api.Test;
import services.NewEmployeeService;
import services.TaxSuperCalculatorHelper;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AddEmployeeServiceTest {

    @Test
    public void testTaxCalculation_TaxFree() {
        double salary = 18200;
        double expectedTax = 0.0;

        double result = TaxSuperCalculatorHelper.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_SecondBracket() {
        double salary = 37000;
        double expectedTax = 3572.0;

        double result = TaxSuperCalculatorHelper.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_ThirdBracket() {
        double salary = 90000;
        double expectedTax = 20797.0;

        double result = TaxSuperCalculatorHelper.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_FourthBracket() {
        double salary = 180000;
        double expectedTax = 54097.0;

        double result = TaxSuperCalculatorHelper.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_GreaterThan180000() {
        double salary = 180001;
        double expectedTax = 54097.45;

        double result = TaxSuperCalculatorHelper.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testSuperCalculation() {
        double salary = 100000;
        double expectedSuper = 10500.0;

        double result = TaxSuperCalculatorHelper.superCalculation(salary);

        assertEquals(expectedSuper, result);
    }

    @Test
    public void testInvalidSalary() {
        String salary = "abc123";
        InputStream in = new ByteArrayInputStream(salary.getBytes());
        System.setIn(in);

        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        NewEmployeeService.validateEmployeeName(scanner, employee);
        assertThrows(NoSuchElementException.class, () -> NewEmployeeService.validateEmployeeSalary(scanner, employee));
    }
}