package day03;

public class Bus extends Car {
	
	public Bus(){
		super("test");
		System.out.println("bus default ������");
	}
	public Bus(String name) {
		super(name);
		System.out.println("bus �� ���ڸ� �޴� ������");
	}
	
	
}
