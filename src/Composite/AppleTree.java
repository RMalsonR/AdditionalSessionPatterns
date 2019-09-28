package Composite;

public class AppleTree implements Count {
    private Apple[] apples;

    public AppleTree(Apple[] apples){
        this.apples = apples;
    }

    public Apple[] getApples() {
        return apples;
    }

    public void setApples(Apple[] apples) {
        this.apples = apples;
    }

    @Override
    public void printCount() {
        for(Apple apple: apples){
            System.out.println("AppleTree: " + apple);
        }
    }
    @Override
    public String toString(){

        return "AppleTree";
    }

}
