
import java.util.Scanner;

public class dateMethod{
	
	public static void americanDate(String day, int date, String month, int year){
	
	System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
	}
	
	public static void europeanDate(String day, int date, String month, int year){
		
		System.out.println("European format: " + day + ", " + date + " " + month +", " + year);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What is the day: ");
		String day = in.nextLine();
		System.out.print("What is the month: ");
		String month = in.nextLine();
		System.out.print("The date? ");
		int date = in.nextInt();
		System.out.print("And finally, the year? ");
		int year = in.nextInt();
	americanDate(day,date,month,year);
	europeanDate(day,date,month,year);
	
	}
}
