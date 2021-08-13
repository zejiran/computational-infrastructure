package threads;

public class ExThreads02c implements Runnable {

	private final static int MAX = 3;
	private String name;

	public ExThreads02c(String name) {
		System.out.println("Implementing the Runnable interface.");
		this.name = name;
	}

	public void run() {
		System.out.println("The name is " + name);
	}

	public static void main(String[] args) {
		Thread[] tArray = new Thread[MAX];

		for (int i = 0; i < tArray.length; i++) {
			tArray[i] = new Thread(new ExThreads02c("Thread " + i));
		}

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].start();
		}
	}
}
