package threads;

public class ExThreads01b extends Thread {

	private String name;

	public ExThreads01b(String name) {
		System.out.println("Extending the Thread class.");
		this.name = name;
	}

	public void run() {
		System.out.println("The name is " + name);
	}

	public static void main(String[] args) {
		ExThreads01b t0 = new ExThreads01b("Thread " + 0);
		ExThreads01b t1 = new ExThreads01b("Thread " + 1);
		ExThreads01b t2 = new ExThreads01b("Thread " + 2);

		t0.start();
		t1.start();
		t2.start();
	}
}
