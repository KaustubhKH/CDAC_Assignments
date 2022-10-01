import java.util.*;

public class Question6{
	
	static float cal(float fahr){
		float celsius ;
		celsius=5*(fahr-32)/9 ;
		return celsius ;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlease tell temperature in Fahrenheit : ");
		float userTemp = sc.nextFloat();
		float result = cal(userTemp);
		System.out.printf("\n%.3f Fahrenheit is %.3f Celsius.\n",userTemp,result);
	}
	
}