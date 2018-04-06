import java.util.Scanner;
public class HexDigit2Dec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit:");
		String hexString = input.nextLine();
		input.close();
		if (hexString.length() != 1) {
			System.out.print("chongshuru");
			System.exit(1);
		}
		char ch = Character.toUpperCase(hexString.charAt(0));
		if(ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.print(ch+value);
		}
		else if (Character.isDigit(ch )) {
			System.out.print(ch + ch);
		}
		else {
			System.out.print("yijignshi ");
		}
		}
	}

