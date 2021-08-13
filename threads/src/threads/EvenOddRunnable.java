package threads;

public class EvenOddRunnable implements Runnable {

	private String name;
	private int limit;
	private int n;

	public EvenOddRunnable(String name, int n, int limit) {
		this.name = name;
		this.n = n;
		this.limit = limit;
	}

	public void run() {
		try {
			for (int i = 1; i < limit; i++) {
				int number = 2 * i - n;
				System.out.println(name + ": " + number);
				Thread.sleep(50);
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		Thread even = new Thread(new EvenOddRunnable("Even Thread", 0, 100));
		Thread odd = new Thread(new EvenOddRunnable("Odd Thread", 1, 100));

		odd.start();
		even.start();
	}
}
