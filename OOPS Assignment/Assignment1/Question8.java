import java.util.*;

public class Question8{
	
	static float cal(float salary){
		float gS;
		
		if(salary<10000){
			gS = salary * 2;
		}
		else{
			gS = salary + 2000 + (float) (0.98*salary);
		}
		return gS ;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		float grossSal;
		System.out.print("\nPlease give your salary details : ");
		float sal = sc.nextFloat();
		grossSal=cal(sal);
		System.out.printf("\nYour Gross Salary is : Rs. %.3f .\n",grossSal);
	}
	
}