class Test {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.print(i++);
		}
		System.out.println("");

		//A ×
		for (int j = 0;; j++) {
			System.out.print(j);
			if (j == 5) {
				break;
			}
		}
		System.out.println("");

		//B × 型未定義と初期化してない k→　int k = 0
		//		for (k; k < 5; k++) {
		//			System.out.print(k);
		//		}
		//		System.out.println("");

		//C 
		int l = 0;
		for (; l < 5;) {
			System.out.print(++l);
		}
		System.out.println("");

		//D 
		for (int m = 0; m < 5;) {
			System.out.print(m);
			++m;
		}
		System.out.println("");

	}
}