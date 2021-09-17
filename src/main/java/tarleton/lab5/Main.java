package tarleton.lab5;
/**
 *
 * @author Joe Meier
 */
public class Main {
    public static void main(String[] args) {
        Road r1 = new Road(102, "Waco");
        Road r2 = new Road(195, "Dallas");
        City c1 = new City("Austin");
        c1.add(r1);
        c1.add(r2);
        c1.print();       
    }
}
