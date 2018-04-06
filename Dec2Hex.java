import java.util.Scanner;
public class Dec2Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("shuru");
		int decimal = input.nextInt();
		input.close();
		String hex = "";
		while (decimal != 0) {
			int hexValue = decimal % 16;
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
					(char)(hexValue +'0'):
						(char)(hexValue - 10 + 'A');
		}
System.out.print(hex);
	}
}
