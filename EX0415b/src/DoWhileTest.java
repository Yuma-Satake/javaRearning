class DoWhileTest {
	public static void main(String[] args) {
		int num = 0;
		//loop1: 
		do {
			switch (num) {
			case 0:
				System.out.print("0");
				num++;
				break;
				//continue;
			case 1:
				System.out.print("1");
				num++;
				break;
				//continue;
			default:
				System.out.print("2");
				num++;
				break;
				//continue;
			}
		} while (num < 5);

	}
}