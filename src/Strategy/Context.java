package Strategy;

public class Context {
    private ArithmeticOperationStrategy strategy;

    public void setStrategy(ArithmeticOperationStrategy strategy){
        this.strategy = strategy;
    }

    public double operationStrategy(double a, double b){
        return strategy.operation(a, b);
    }
}
