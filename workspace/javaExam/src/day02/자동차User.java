package day02;

public class �ڵ���User {
	public static void run(�ڵ��� c) {
		c.run();
	}

	public static void main(String[] args) {
		
		
		
		�ڵ��� c1 = new ��ũ����();
		�ڵ��� c2 = new ����();
		�ڵ��� c3 = new ������ī();
		
		//�θ�� �ڽ��� ����ų �� �ִ�. 
		
	//	���� b = new �ڵ���(); //�Ұ����ϴ�!!  
		
		c2.�޸���();
		if(c3 instanceof ����) {
			((����)c3).�ȳ�����ϴ�();
		}
		
		run(c3);
		
		c3.�޸���();
		
	}

}
