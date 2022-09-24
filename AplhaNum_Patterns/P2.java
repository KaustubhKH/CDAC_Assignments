public class P2
{
	public static void main(String args[])
	{
		
		//used for inside for to create a pattern...
		//nested for
		
		System.out.println();
		for(int i=65 ; i<=69 ; i++){
			for(int a=65 ; a<=i ; a++){
				char z = (char) a;//did downcasting
				System.out.print(z+" ");//printed it...
			}
			System.out.println();
		}
		System.out.println();
	}
}