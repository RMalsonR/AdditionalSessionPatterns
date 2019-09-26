package Main;
import Strategy.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /* СТРАТЕГИЯ */
    Context strategy = new Context();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers");
    double a = in.nextDouble();
    double b = in.nextDouble();
    System.out.println("Choose operation:\n\t[1]: +\n\t[2]: -\n\t[3]: *");
    int operation = in.nextInt();
    double result=0;
    switch (operation){
        case 1: {
                strategy.setStrategy(new AddStrategy());
                result = strategy.operationStrategy(a,b);
                break;
        }
        case 2: {
                strategy.setStrategy(new SubstractStrategy());
                result = strategy.operationStrategy(a,b);
                break;
        }
        case 3: {
                strategy.setStrategy(new MultiplyStrategy());
                result = strategy.operationStrategy(a,b);
                break;
        }
    }
    System.out.printf("Your result is %.1f\n", result);
    }
}
