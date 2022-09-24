public class P9
{
	public static void main(String args[])
	{
		
		//used for inside for to create a pattern...
		//nested for
		
		System.out.println();
		for(int i=65,k=0 ; i<=69 ; i++,k++){
			
			//printing the spaces...
			for(int j=4-k ; j>0 ; j--){System.out.print(" ");}
			
			//another for printing the chars...
			for(int a=65 ; a<=i ; a++){
				char z = (char) a;//downcasting...
				System.out.print(z+" ");//printing it...
			}
			System.out.println();
		}
		System.out.println();
	}
}