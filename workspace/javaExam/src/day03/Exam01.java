package day03;

public class Exam01{

	public static void main(String[] args) {
		byte b = 20;
		int i = b;  //������ ����ȯ 
		
		b = (byte)i ; //����� ����ȯ
		
		// boolean flag = (boolean)b;
		
		Parent p = new  Child();
		Child c = (Child)p; // ����� ����ȯ
		
		Child c2 = new Child();
		Parent p2 = c2; //����������ȯ
		Object obj = c2;
		Object obj2 = p;
		
		Bus bus = new Bus();
		//��ü�鳢���� ����ȯ�� ��Ӱ��迡 �ִ� �͵鳢�� �����ϴ�.
	}

}
