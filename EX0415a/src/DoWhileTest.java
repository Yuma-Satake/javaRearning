class DoWhileTest {
	public static void main(String[] args) {
		// Step01
		System.out.println("Step01");
		for (int a = 0; a < 10; a++) {
			if (a % 2 == 0) {
				break;
			}
			System.out.println(a);
		}
		// Step02
		System.out.println("Step02");
		int[] nums = {10, 20, 30, 40, 50};
		// loop1:
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 30) {
				break;
			}
			System.out.println(i);
		}
		// Step03
		System.out.println("Step03");
		int[][] nums2 = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}};
		System.out.println(nums2.length);
		int i;
		int j;
		// loop2:
		loop2: for (i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i].length);
			for (j = 0; j < nums2[i].length; j++) {
				if (nums2[i][j] == 30) {
					break loop2;
				}
				System.out.println(i);
			}
		}
	}
}
