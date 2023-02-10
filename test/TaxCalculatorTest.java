import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTest {

    @Test
    public void testTaxCalculation_TaxFree() {
        double salary = 18200;
        double expectedTax = 0.0;
        double result = TaxCalculator.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }
    @Test
    public void testTaxCalculation_SecondBracket() {
        double salary = 37000;
        double expectedTax = 3572.0;
        double result = TaxCalculator.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_ThirdBracket() {
        double salary = 90000;
        double expectedTax = 20797.0;
        double result = TaxCalculator.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_FourthBracket() {
        double salary = 180000;
        double expectedTax = 54097.0;
        double result = TaxCalculator.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }

    @Test
    public void testTaxCalculation_GreaterThan180000() {
        double salary = 180001;
        double expectedTax = 54097.45;
        double result = TaxCalculator.taxCalculation(salary);

        assertEquals(expectedTax, result);
    }
}