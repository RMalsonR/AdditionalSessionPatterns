package Main;
import Composite.*;
import Iterator.*;
import Strategy.*;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Choose pattern:\n\t[1] - Strategy\n\t[2] - Iterator\n\t[3] - Composite");
    int choose = in.nextInt();
    switch (choose) {
        case 1: {
            /* СТРАТЕГИЯ */
            Context strategy = new Context();
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
        case 2:{
            Root root = new Root("беж");
            Prefix prefix = new Prefix("пере");
            Suffix suffix = new Suffix("к");
            Ending ending = new Ending("a");

            Word word = new Word(root, prefix, suffix, ending);

            Iterator wordIterator = word.iterator();
            while (wordIterator.hasNext()) {
                WordPart part = (WordPart) wordIterator.next();
                System.out.println(part.getClass() + ": " + part.getWordPart());
            }
        }
        case 3:{
            Apple[] apples1 = {new Apple(12.5), new Apple(21.9), new Apple(33.3), new Apple(19.7),
                    new Apple(14)};

            Apple[] apples2 = {new Apple(12.5), new Apple(21.9), new Apple(33.3), new Apple(19.7),
                    new Apple(14)};

            AppleTree appleTree1 = new AppleTree(apples1);
            AppleTree appleTree2 = new AppleTree(apples2);

            AppleTree[] appleTrees = {appleTree1, appleTree2};

            Land[] lands = {new Land(appleTrees, 25.7)};

            Garden garden = new Garden(lands);

            CompositeCount compositeCount = new CompositeCount();
            compositeCount.add(garden);
            compositeCount.add(lands[0]);
            compositeCount.add(appleTrees[0]);
            compositeCount.add(appleTrees[1]);
            compositeCount.printCount();
        }
    }
    }
}
