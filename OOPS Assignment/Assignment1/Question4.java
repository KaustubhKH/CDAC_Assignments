import java.util.*;
public class Question4 {
	
	static double cal(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlease tell principal amount : ");
		double prinAmnt = sc.nextDouble();
		System.out.print("\nPlease tell rate of interest : ");
		double roi = sc.nextDouble();
		System.out.print("\nPlease tell amount of time borrowing for : ");
		double time = sc.nextDouble();
		double simpleIntrst = prinAmnt*(1+(roi/100)*time);
		return simpleIntrst;
	}
	
	public static void main(String args[]){
		double ans = Question4.cal();
		System.out.println("\nThe simple interest for paticular data is : "+ans);
	}
}