class DoWhileTest {
	public static void main(String[] args) {
		int num = 0;
		do {
			switch (num) {
			case 0:
				System.out.print("0");
				num++;
				break;
			case 1:
				System.out.print("1");
				num++;
				break;
			//defaultがbreakではないため5回ループする
			default:
				System.out.print("2");
				num++;
				continue;
			}
		} while (num < 5);
	}
}