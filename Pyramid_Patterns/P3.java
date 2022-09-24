public class P3
{
	public static void main(String args[])
	{
		System.out.println();
		for(int i=1;i<=9;i++){
			
			//spaces...
			for(int a=9-i;a>0;a--){
				System.out.print(" ");
			}
			
			//printing stars...
			for(int j=1;j<i+1;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}