package Composite;

public class Apple implements Count {
    private double weight;

    public Apple(double weight){
        this.weight = weight;
    }

    @Override
    public void printCount() {
        System.out.println("Apple: " + weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){

        return "Apple " + weight;
    }
}
