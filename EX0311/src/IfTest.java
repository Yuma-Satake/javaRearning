class IfTest {
	public static void main(String args[]) {
		int i = 3;

		// A
		if (i <= i) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// B
		if (i == 3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// C　代入文は評価値　true falseにならない
		//		if (i = 3) {
		//			System.out.println("true");
		//		} else {
		//			System.out.println("false");
		//		}
		// D　
		if (i != 3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// E　
		if (true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}