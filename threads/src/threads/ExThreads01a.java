package threads;

public class ExThreads01a extends Thread {

	private int n;

	public ExThreads01a(int n) {
		System.out.println("Extending the Thread class.");
		this.n = n;
	}

	public void run() {
		System.out.println("The initial value is " + n);
	}

	public static void main(String[] args) {
		ExThreads01a t = new ExThreads01a(5);

		t.start();
	}
}
