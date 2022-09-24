public class P1
{
	public static void main(String args[])
	{
		System.out.println();
		for(int i=1;i<=9;i++){
			
			//spaces...
			for(int a=9-i;a>0;a--){
				System.out.print(" ");
			}
			
			//printing the characters...
			for(int j=0;j<i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}