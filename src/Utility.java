import java.math.BigDecimal;

public class Utility {

    public static BigDecimal addition (BigDecimal num1, BigDecimal num2)
    {
        return num1.add(num2);
    }

    public static BigDecimal subtraction (BigDecimal num1, BigDecimal num2)
    {
        return num1.subtract(num2);
    }

    public static BigDecimal multiplication (BigDecimal num1, BigDecimal num2)
    {
        return num1.multiply(num2);
    }
    public BigDecimal calculatePercent(double amount, float percent)
    {
        BigDecimal percentValue = (new BigDecimal(amount*(percent/100.0f)));
        return percentValue;
    }
}


