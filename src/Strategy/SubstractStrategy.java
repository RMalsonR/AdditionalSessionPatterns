package Strategy;

public class SubstractStrategy implements ArithmeticOperationStrategy {
    @Override
    public double operation(double a, double b) {
        return a-b;
    }
}
