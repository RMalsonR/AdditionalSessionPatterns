package Strategy;

public class MultiplyStrategy implements ArithmeticOperationStrategy {
    @Override
    public double operation(double a, double b) {
        return a*b;
    }
}
