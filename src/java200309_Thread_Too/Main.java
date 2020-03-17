package java200309_Thread_Too;

public class Main {

	public static void main(String[] args) {
//		Too t = new Too();
//		t.setName("서울");
//		
//		Too t1 = new Too();
//		t1.setName("천안");
//		
//		Too t2 = new Too();
//		t2.setName("대구");
//		
//		Too t3 = new Too();
//		t3.setName("대전");
//		
//		t.start();
//		t1.start();
//		t2.start();
//		t3.start();

		String[] tName = { "서울", "천안", "대구", "대전" };

		for (int i = 0; i < tName.length; i++) {
			Too t = new Too();
			t.setName(tName[i]);
			t.start();
		}
	}
}
