package java8;

public class NestedTry {
	
	
	static void test() {
		try {
			System.out.println("1St Try");
			try {
				System.out.println("2nd Nested try");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NestedTry.test();
	}

}
