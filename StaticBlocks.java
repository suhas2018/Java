/**
 * @author Suhas KM
 * 
 * Program : Static Block Concept
 *
 */

public class StaticBlocks {

	static {
		System.out.println("Inside static block");
	}
	
	public StaticBlocks() {
		System.out.println("Inside Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Inside main 1");
		new StaticBlocks();
		System.out.println("Inside main 2");
	}

}
