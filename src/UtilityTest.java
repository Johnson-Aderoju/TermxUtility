import java.math.BigDecimal;

public class UtilityTest {
    public static void main(String[] args) {

        Utility utility = new Utility();

        System.out.println(utility.addition(new BigDecimal(500.12222), new BigDecimal(3345.897)));

        System.out.println(utility.subtraction(new BigDecimal(500), new BigDecimal(33)));

        System.out.println(utility.multiplication(new BigDecimal(500), new BigDecimal(33)));

        System.out.println(utility.calculatePercent(500_000,(float) 54.03));

    }
}