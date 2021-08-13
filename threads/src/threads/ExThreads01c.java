package threads;

public class ExThreads01c extends Thread {

	private final static int MAX = 3;
	private String name;

	public ExThreads01c(String name) {
		System.out.println("Extending the Thread class.");
		this.name = name;
	}

	public void run() {
		System.out.println("The name is " + name);
	}

	public static void main(String[] args) {
		ExThreads01c[] tArray = new ExThreads01c[MAX];

		for (int i = 0; i < tArray.length; i++) {
			tArray[i] = new ExThreads01c("Thread " + i);
		}

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].start();
		}
	}
}
