package java200309_Thread_Too;

public class Main {

	public static void main(String[] args) {
//		Too t = new Too();
//		t.setName("����");
//		
//		Too t1 = new Too();
//		t1.setName("õ��");
//		
//		Too t2 = new Too();
//		t2.setName("�뱸");
//		
//		Too t3 = new Too();
//		t3.setName("����");
//		
//		t.start();
//		t1.start();
//		t2.start();
//		t3.start();

		String[] tName = { "����", "õ��", "�뱸", "����" };

		for (int i = 0; i < tName.length; i++) {
			Too t = new Too();
			t.setName(tName[i]);
			t.start();
		}
	}
}
