class ExForTest {
	public static void main(String[] args) {
		int[] array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		//A B　文法エラー
		//C 初期値　i=0になる
		//D i++と後置演算子なのでarray[i]を出力してからインクリメント
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}