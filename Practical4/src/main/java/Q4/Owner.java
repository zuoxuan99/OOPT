
package Q4;

public class Owner {
    private String name;
    private String ic;
    
    public Owner() {
        this("","");
    }
    public Owner(String name) {
        this(name,"");
    }
    
    public Owner(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }
    
    public String toString() {
        return String.format("%-20s %-15s", this.name, this.ic);
    }
}
