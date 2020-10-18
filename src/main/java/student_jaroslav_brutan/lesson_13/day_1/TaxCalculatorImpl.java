package student_jaroslav_brutan.lesson_13.day_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator{


    @Override
    public BigDecimal calculateTax(BigDecimal income){
        if (income.compareTo(new BigDecimal("20000")) <=0){
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen2000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen2000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}