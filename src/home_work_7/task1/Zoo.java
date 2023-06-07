package home_work_7.task1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<String> animals = new ArrayList<>();

    public List<String> getAnimals() {
        return animals;
    }
    public void add(int index, String animal){
        animals.add(index, animal);
    }
//    public String getByIndex(int index){
//        return animals.get(index);
//    }
}
