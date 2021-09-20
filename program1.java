import java.io.*;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		double a = s.nextDouble();

		System.out.print("Enter the Second number : ");
		double b = s.nextDouble();

		System.out.print("Select the operator " + " + " + " - " + " * " + " /  : ");
		String opr = br.readLine();

		switch (opr) {

		case "+":
			double add = a + b;
			System.out.println("Result : " + add);
			break;

		case "-":
			double sub = a - b;
			System.out.println("Result : " + sub);
			break;
		case "*":
			double mul = a * b;
			System.out.println("Result : " + mul);
			break;
		case "/":
			double div = a / b;
			System.out.println("Result : " + div);
			break;

		default:
			System.out.println("Invalid operator");

		}

	}

}
