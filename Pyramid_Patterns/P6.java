public class P6
{
	public static void main(String args[])
	{
		System.out.println();
		for(int i=0 ; i<9 ; i++){
			
			//spaces
			for(int a=0+i ; a>0 ; a--){
				System.out.print(" ");
			}
			
			//printing star ...
			for(int j=9-i; j>=1 ; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}