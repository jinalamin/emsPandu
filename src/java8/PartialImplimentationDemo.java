package java8;


interface Study{
	void theory();
	void practical();
}

abstract class Room implements Study{

	@Override
	public void theory() {
		System.out.println("THEORY");
	}
	
}

class Lab extends Room{

	@Override
	public void practical() {
		System.out.println("PRACTICAL");
	}
	
}

public class PartialImplimentationDemo {

	public static void main(String[] args) {
		Lab obj = new Lab();
		obj.practical();
		obj.theory();

	}

}
