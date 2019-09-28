package Composite;

public class Garden implements Count {
    private Land[] lands;

    public Garden(Land[] lands){
        this.lands = lands;
    }

    public Land[] getLands() {
        return lands;
    }

    public void setLands(Land[] lands) {
        this.lands = lands;
    }

    @Override
    public void printCount() {
        for(Land land: lands){
            System.out.println("Garden: " + land);
        }
    }

    @Override
    public String toString(){

        return "Garden";
    }
}
