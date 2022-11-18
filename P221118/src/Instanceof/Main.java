package Instanceof;

public class Main {
	public static void main(String[] args) {
		Parent pr = new Parent();
		Child child = new Child();

		if (pr instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (pr instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (child instanceof Parent) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (child instanceof Child) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
