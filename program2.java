
import java.util.Scanner;

public class program2{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Limit : ");
		int limit = s.nextInt();
		int mul = limit * 2;

		for (int i = 1; i <= mul; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " , ");
			}

		}

	}

}
