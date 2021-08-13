package threads;

public class ExThreads02 implements Runnable {

	public void run() {
		System.out.println("Implementing the Runnable interface.");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ExThreads02());

		t.start();
	}
}
