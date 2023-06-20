class ForTest {
	public static void main(String args[]) {
		String[] color = { "red", "blue", "white", "black" };

		//終了判定はcolor.lengthではなくcolor.length - 1(インデックスは0から始まるため）
		for (int i = 1; i <= color.length - 1; i++) {
			System.out.print(color[i] + " : ");
		}
	}
}