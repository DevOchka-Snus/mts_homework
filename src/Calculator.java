import java.math.BigDecimal;

public class Calculator {
    public int amount;
    public BigDecimal price;
    public BigDecimal discount;

    public Calculator(int amount, BigDecimal price, BigDecimal discount) {
        this.amount = amount;
        this.price = price;
        this.discount = discount;
    }
}
