class ForTest {
    public static void main(String[] args) {
    	// 終了判定は奇数か　i+=2で永遠に奇数なため無限ループ
    	//強制終了はコンソールの右上の赤い終了ボタン
        for(int i = 1; i % 2 == 1; i += 2) {
            System.out.print(i);
        }
    }
}