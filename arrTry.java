import java.util.Scanner;
public class arrTry {

	public static void main(String[] args) {


			int i = 0 ;
			Scanner input = new Scanner(System.in);
			int[] arr = new int[10];
			for( ; i < 10 ; i++ )
				arr[i] =input.nextInt();
			for( i = 0 ; i < 10 ; i++ )
				System.out.print(arr[i]);
			input.close();
			int temp = -1;
			for( i = 0 ; i < 10 ; i++)
				for ( int j = i+1 ; j <10 ; j++) {
					if(arr[i]>arr[j]) {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;

				}
		}for( i = 0 ; i < 10 ; i++ )
				System.out.print(arr[i]);

	}}


