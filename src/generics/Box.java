package generics;

import java.util.HashSet;
import java.util.Set;

public class Box<T>{
    private Set<T> boxes = new HashSet<>();

    public void add(T t){
        boxes.add(t);
    }

    public Set<T> getBoxes(){
        return boxes;
    }

}
