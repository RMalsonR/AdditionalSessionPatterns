package Composite;

public class Land implements Count {
    private AppleTree[] appleTrees;
    private double square;

    public Land(AppleTree[] appleTrees, double square){
        this.appleTrees = appleTrees;
        this.square = square;
    }

    @Override
    public void printCount(){
        for(AppleTree appleTree: appleTrees){
            System.out.println("Land: " + appleTree + " | " + square);
        }
    }

    public AppleTree[] getAppleTrees() {
        return appleTrees;
    }

    public void setAppleTrees(AppleTree[] appleTrees) {
        this.appleTrees = appleTrees;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString(){

        return "Lands";
    }
}
