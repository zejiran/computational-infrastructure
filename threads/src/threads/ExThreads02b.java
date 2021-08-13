package threads;

public class ExThreads02b implements Runnable {

	private String name;

	public ExThreads02b(String name) {
		System.out.println("Implementing the Runnable interface.");
		this.name = name;
	}

	public void run() {
		System.out.println("The name is " + name);
	}

	public static void main(String[] args) {
		Thread t0 = new Thread(new ExThreads02b("Thread " + 0));
		Thread t1 = new Thread(new ExThreads02b("Thread " + 1));
		Thread t2 = new Thread(new ExThreads02b("Thread " + 2));

		t0.start();
		t1.start();
		t2.start();
	}
}
