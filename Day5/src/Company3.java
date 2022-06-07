
public class Company3 {
	String name;
    public static void main(String[] args) {
    	Company3 c = new Company3();
    	Company3 c1 = c;
    	c1.name = "C2TC";
    	c = c1;
    	System.out.println(c.name); }
}
