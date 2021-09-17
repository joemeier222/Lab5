package tarleton.lab5;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Joe Meier
 */
public class City {
    private final String name;
    private final List<Road> roads;

    public City(String name) {
        this.name = name;
        roads = new ArrayList<>();
    }
    
    public void add(Road r){
        roads.add(r);
    }
    
    public void print(){
        System.out.println("City: " + name);
        roads.forEach(r -> {
            r.print();
        });
    }
    
}