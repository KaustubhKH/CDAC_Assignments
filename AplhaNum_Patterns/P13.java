public class P13
{
	public static void main(String args[])
	{
		
		//used for inside for to create a pattern...
		//nested for
		
		System.out.println();
		
		//double dynamic variavble declaration...
		for(int i=65,k=0 ; i<=69 ; i++,k++){
			//print spaces
			for(int j=4-k ; j>0 ; j--){System.out.print(" ");}
			//print chars
			for(int a=65 ; a<=i ; a++){
				char z = (char) i;//downcast
				System.out.print(z+" ");//print
			}
			System.out.println();
		}
		System.out.println();
	}
}