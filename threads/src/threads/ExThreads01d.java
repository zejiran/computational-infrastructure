package threads;

public class ExThreads01d extends Thread {

	private String name;

	public ExThreads01d(String name) {
		System.out.println("Extending the Thread class.");
		this.name = name;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + " " + "value: " + i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
		}

		System.out.println("Finishing: " + name);
	}

	public static void main(String[] args) {
		ExThreads01d t0 = new ExThreads01d("Thread " + 0);
		ExThreads01d t1 = new ExThreads01d("Thread " + 1);
		ExThreads01d t2 = new ExThreads01d("Thread " + 2);

		t0.start();
		t1.start();
		t2.start();
	}
}
