package threads;

public class ExThreads02a implements Runnable {

	private int n;

	public ExThreads02a(int n) {
		System.out.println("Implementing the Runnable interface.");
		this.n = n;
	}

	public void run() {
		System.out.println("The initial value is " + n);
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ExThreads02a(5));

		t.start();
	}
}
