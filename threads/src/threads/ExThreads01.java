package threads;

public class ExThreads01 extends Thread {

	public void run() {
		System.out.println("Extending the Thread class.");
	}

	public static void main(String[] args) {
		ExThreads01 t = new ExThreads01();

		t.start();
	}
}
