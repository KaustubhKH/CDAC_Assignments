import java.util.*;

public class Question7{
	
	static float[] swap(float f, float s){
		float[] ans = new float[2];
		float fst = f;
		float scnd = s;
		fst = fst + scnd;
		scnd = fst - scnd;
		fst = fst - scnd;
		ans[0]=fst;
		ans[1]=scnd;
		return ans ;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		float[] arr = new float[2];
		
		System.out.print("\nPlease give first number : ");
		float first = sc.nextFloat();
		System.out.print("\nPlease give second number : ");
		float second = sc.nextFloat();
		arr = swap(first,second);
		System.out.printf("\nFirst number is : %.3f And second number is : %.3f .\n",arr[0],arr[1]);
	}
	
}