package Strategy;

public class AddStrategy implements ArithmeticOperationStrategy {
    @Override
    public double operation(double a, double b) {
        return a+b;
    }
}
