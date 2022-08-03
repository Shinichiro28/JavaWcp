
public class Chapter08 {
	public static void main(String[] args) {
		int number1 = 1;
		while (number1 < 5) {
			System.out.println("Chapter08-1 = " + number1 * number1);
			number1++;
		}
		int[] array2 = {1, 2, 3, 4};
		for (int i = 0; i < array2.length; i++) {
			System.out.println(i);
		}
		for (int number3 : array2) {
			if (number3 % 2 == 0) {
				continue;
			}
			System.out.println("Chapter08-3 = " + number3);
		}
	}
}
