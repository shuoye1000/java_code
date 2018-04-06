import java.util.Scanner;
public class Rili{
	public static void main(String[] args){
		int years = 0;
		int months = 0;
		int days = 0;
		boolean runNian =false;
		Scanner input = new Scanner(System.in);
		System.out.print("输入年份：");
		years = input.nextInt();
		System.out.print("输入月份:");
		months = input.nextInt();
		System.out.println("\n            "+years+"年"+months+"月日历");
		if((years % 4 == 0 && years % 100 != 0)||(years % 400 ==0)){
			runNian = true;}
		int zdays = 0;
		for(int i = 0;i <= years;i++){
			if((years % 4 == 0 && years % 100 != 0)||(years % 400 ==0)){
				zdays = zdays + 366;}
			else{zdays = zdays +365;}}
		int ydays = 0;
		for(int j = 0; j <= months;j++){
			switch(j){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				days = 31;
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				days = 30;
				break;
				case 2:
				if(runNian){
					days = 29;}
				else{
					days = 28;}
				}
		if(j < months){
				ydays = ydays + days;}}
		zdays = zdays + ydays;
		int firstDayOfMonth = 0;
		int c = 1 + zdays % 7;
		if(c == 7)
			{firstDayOfMonth = 0;}
		else
			{firstDayOfMonth = c;}
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(int k = 0;k < firstDayOfMonth;k++){
			System.out.print("\t");}
		for(int m = 1;m <= days;m++){
		System.out.print(m+"\t");
		if((zdays + m) % 7 == 6){
		System.out.print("\n");}}}}
