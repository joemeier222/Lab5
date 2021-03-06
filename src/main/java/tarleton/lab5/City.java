package tarleton.lab5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Joe Meier
 */
public class City implements Comparable<City> {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.name);
    }
    
    public void write() {
        try (PrintWriter out = new PrintWriter(
            new OutputStreamWriter(
                new FileOutputStream("output.txt", true),"UTF-8"))) {
                out.printf("%s",this.name);
                roads.forEach(r -> {
                    out.printf(",%s,%s", Integer.toString(r.getLength()),r.getDest());
                 });
                out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
    
}
