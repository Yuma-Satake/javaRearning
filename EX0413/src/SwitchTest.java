public class SwitchTest {
    public static void main(String[] args) {
        char[] array = { 'a', 'b', 'c' };
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            switch (array[i]) {
            case 'a':
                count++;
                //break文なし
            case 'b':
                count++;
                break;
            case 'c':
                count++;
                //break文なし
            case 'd':
                count++;
                break;
            }
        }
        System.out.print("Count = " + count);
    }
}