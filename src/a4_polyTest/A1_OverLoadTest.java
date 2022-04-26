package a4_polyTest;

public class A1_OverLoadTest {

	public static void main(String[] args) {

		add(1, 1);
		add(2, 3, 4);
		add(5, 5, "Addition of 2 numbers is:");

	}

	public static void add(int i, int j) {

		// int i=1;
		// int j=2;
		int k = i + j;
		System.out.println(k);

	}

	public static void add(int i, int j, int k) {

		// int i=2;
		// int j=4;
		int l = i + j + k;
		System.out.println(l);

	}

	public static void add(int i, int j, String msg) {

		// int i=2;
		// int j=4;
		int l = i + j;
		System.out.println(msg + l);

	}

}
