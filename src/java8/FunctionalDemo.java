package java8;

@FunctionalInterface
interface functionalInterfaceDemo{
	public abstract void m1();
	
	//public abstract void m3();
	
	default void m2() {
		System.out.println("abcd1");
	}	
}

public class FunctionalDemo {

	public static void main(String[] args) {
		
	}
}