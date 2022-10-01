import java.util.*;
public class Question3 {
	
	static void	 cal(String[] Obj){
		int result=0;
		double per=0;
		for(int i=0; i < Obj.length ; i++){
			result+=Integer.parseInt(Obj[i]);
		}
		per= (double) (result*10)/Obj.length;
		System.out.println("You have obtained : "+result+" out of "+Obj.length*10);
		System.out.printf("You have obtained : %.3f",per);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease give marks of any no. of subjects following spaces (Out of 10) : ");
		String marks = sc.nextLine();
		
		String submarks[] = marks.split(" ");
		Question3.cal(submarks);
	}
}