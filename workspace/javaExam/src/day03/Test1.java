package day03;

public class Test1 {

	public static void main(String[] args) {
		
		//��� -  �ʵ峪 �޼��尡 ���� �ϳ��� �������� ����� �ʿ䰡 ����. 
		// �ʵ�� �������̵� �Ǹ� Ÿ���� ������.
		//�޼ҵ�� �������̵� �Ǹ� ������ �ڽİ��� ����Ѵ�. 
		
		Parent p = new Parent();
		System.out.println(p.i);  //10
		System.out.println(p.getI()); //10
		if(p instanceof Child)
			((Child)p).print();	
		
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
		c.print();
		
		
		Parent pc = new Child();
		System.out.println(pc.i);
		System.out.println(pc.getI());
		if(pc instanceof Child)
			((Child)pc).print();
		
	}

}
