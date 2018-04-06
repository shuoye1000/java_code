import java.util.Scanner;
public class Calculate {

	public  int daysCalculate(int year,int month){
		int count = 0;
		int i = 0;
		for(i = 1800 ;i < year ; i++)
			if(isLeapYear(year ))
				count += 366 ;
			else count +=365;
		for(i = 1 ; i < month ; i++ )
			count += daysOfMonth(year,month);
		return count;


	}

	public int daysOfMonth(int year,int month) {
		int days;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days = 31;break;
		case 4:
		case 6:
		case 9:
		case 11:days = 30;break;
		case 2:if(isLeapYear(year )) days = 29;
		else days = 28;
		default: days = 0;

		}
		return days;
	}
	public boolean isLeapYear(int year ){
	if((year%4==0&&year%100!=0)||(year%400==0))
		return true;
	else return false;

	}
	public void printf() {
		System.out.print("Sun Mon Tue Wed Thr Fri Sar");
		System.out.println();
	}
	public void calender(int year,int week,int month) {
		int i = 0 ;
		for(i = 1 ; i < week ; i++)
			System.out.print("    ");
		int m = daysOfMonth(year,month);
		for (i = 1 ; i < m ;i++  ) {
			System.out.print("   "+i);
			if((week+i) % 7 == 0)
				System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要打印的年份");
		int year = input.nextInt();
		System.out.print("请输入要打印的月份");
		int month = input.nextInt();
		int days = daysCalculate(year, month);
		input.close();
		int week = (days + 3 ) % 7 ;
		printf();
		calender(year,week,month);


	}

}
