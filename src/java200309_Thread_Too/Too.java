package java200309_Thread_Too;

// 투표
import java.util.Random;

// 스레드 돌리기위한 메서드는 상속받아야한다.
// run 메서드를 호출할때는 참조변수 . run 이 아니라 start를 해준다.
// 개체생성, 부모객체생성은 독립적인 것

public class Too extends Thread {
	private Random r = new Random();
	private int nowE = 0;
	private int nowP = 0;
	private String goGr = "";
	private String thisName = "";

	@Override
	public void run() { // run이 실행되어야 멀티스레드 실행된다.
		thisName = Thread.currentThread().getName();
		while (nowE < 100) {
			gogogo(); // gogogo 와 prt 두 개를 멀티스레드 처리하겠다.
			prt();
		}
	}

	private void gogogo() {
		nowP = r.nextInt(5) + 1;
		nowE = nowE + nowP;

		for (int i = 0; i < nowP; i++) {
			goGr = goGr + "#";
		}
		
		try {	// 하나하나 뒤죽박죽 나와야 하는데 너무 빨리 출력되기 때문에 시간을 걸어주었다. 
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void prt() {
		System.out.println(thisName+ "(nowP) : " +nowP);
		System.out.println(thisName + "(nowE) : " +nowE);
		System.out.println(thisName + " : " + goGr);
	}

}
