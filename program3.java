
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Limit : ");
		int limit = s.nextInt();

		if (limit % 2 == 0) {
			limit--;
		}

		int mul = limit * 2;

		for (int i = 1; i <= mul; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " , ");
			}
		}
	}
}

