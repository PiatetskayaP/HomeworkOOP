package task.one;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 100; i++) {
			Factorial f = new Factorial(i);
			Thread t = new Thread (f);
			t.start();
		}
	}

}
