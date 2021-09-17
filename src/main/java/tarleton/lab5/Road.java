package tarleton.lab5;

/**
 *
 * @author Joe Meier
 */
public class Road {
    private final String dest;
    private final int length;

    public Road(int length, String dest) {
        this.length = length;
        this.dest = dest;
    }

    public String getDest() {
        return dest;
    }

    public int getLength() {
        return length;
    }
    
    @Override
    public String toString() {
        return "Destination: " + dest  + ", Length: " + length + " mi"; 
    }
    
    public void print(){
        System.out.println(this.toString());
    }
    
}