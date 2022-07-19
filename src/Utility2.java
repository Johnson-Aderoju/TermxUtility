import java.math.BigDecimal;

public class Utility2 {
    private BigDecimal num1;
    private BigDecimal num2;

    public Utility2 (BigDecimal numA, BigDecimal numB)
    {
        num1 = numA;
        num2 = numB;
    }

    public BigDecimal addition ()
    {
        return num1.add(num2);
    }

    public BigDecimal subtraction ()
    {
        return  num1.subtract(num2);
    }

    public BigDecimal multiplication ()
    {
        return  num1.multiply(num2);
    }

    public BigDecimal calculatePercent(double amount, float percent)
    {
        BigDecimal percentValue = (new BigDecimal(amount*(percent/100.0f)));
        return percentValue;
    }
}



