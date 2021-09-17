package tarleton.lab5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Joseph Meier
 */
public class Main {
    public static void main(String[] args) {
        try {
        Path pc = Paths.get("input.txt");
        Charset cs = Charset.forName("UTF-8");
        List<String> lines = Files.readAllLines(pc,cs);
        Set<City> cities = new HashSet<>();
        for (String line : lines) {
            String [] s = line.split(",");
            City c = new City(s[0]);
            for(int i = 1; i < s.length; i++){
                Road r = new Road(Integer.parseInt(s[i]),s[i+1]);
                c.add(r);
                i++;
            }
            cities.add(c);
        }
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}

