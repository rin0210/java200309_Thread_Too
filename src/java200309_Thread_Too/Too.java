package java200309_Thread_Too;

// ��ǥ
import java.util.Random;

// ������ ���������� �޼���� ��ӹ޾ƾ��Ѵ�.
// run �޼��带 ȣ���Ҷ��� �������� . run �� �ƴ϶� start�� ���ش�.
// ��ü����, �θ�ü������ �������� ��

public class Too extends Thread {
	private Random r = new Random();
	private int nowE = 0;
	private int nowP = 0;
	private String goGr = "";
	private String thisName = "";

	@Override
	public void run() { // run�� ����Ǿ�� ��Ƽ������ ����ȴ�.
		thisName = Thread.currentThread().getName();
		while (nowE < 100) {
			gogogo(); // gogogo �� prt �� ���� ��Ƽ������ ó���ϰڴ�.
			prt();
		}
	}

	private void gogogo() {
		nowP = r.nextInt(5) + 1;
		nowE = nowE + nowP;

		for (int i = 0; i < nowP; i++) {
			goGr = goGr + "#";
		}
		
		try {	// �ϳ��ϳ� ���׹��� ���;� �ϴµ� �ʹ� ���� ��µǱ� ������ �ð��� �ɾ��־���. 
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
