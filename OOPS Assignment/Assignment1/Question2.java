import java.util.*;
public class Question2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextInt();
		double circumference =  2*3.1415*radius;
		double area = 3.1415*radius*radius;
		
		System.out.printf("Circumference is : %.3f\n",circumference);
		System.out.printf("Area is : %.3f",area);
	}
}