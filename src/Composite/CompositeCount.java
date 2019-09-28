package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCount implements Count {
    private List<Count> childCount = new ArrayList<Count>();


    @Override
    public void printCount() {
        for(Count count: childCount){
            count.printCount();
        }
    }

    public void add(Count count){
        childCount.add(count);
    }

    public void remove(Count count){
        childCount.remove(count);
    }
}
