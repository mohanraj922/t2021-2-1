
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the limit : ");
		int limit = s.nextInt();

		int arr[] = new int[limit];
		System.out.println("Enter the elements  ");

		for (int i = 0; i < limit; i++) {
			arr[i] = s.nextInt();
		}

		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				two++;
			}
			if (arr[i] % 3 == 0) {
				three++;
			}
			if (arr[i] % 4 == 0) {
				four++;
			}
			if (arr[i] % 5 == 0) {
				five++;
			}
			if (arr[i] % 6 == 0) {
				six++;
			}
			if (arr[i] % 7 == 0) {
				seven++;
			}
			if (arr[i] % 8 == 0) {
				eight++;
			}
			if (arr[i] % 9 == 0) {
				nine++;
			}
		}

		System.out.println("[ "+"1 : " + arr.length + ",2 : " + two + ",3 : " + three + ",4 : " + four + ",5 : " + five
				+ ",6 : " + six + ",7 : " + seven + ",8 : " + eight + ",9 : " + nine+" ]");

	}

}
