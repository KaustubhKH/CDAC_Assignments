public class P5
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++){
			
			//spaces...
			for(int s=9-i ; s>0 ; s--){System.out.print("  ");}
			
			//printing before mid value occurs ...
			for(int a=9-i+1 ; a<9 ; a++){
				System.out.print(a+" ");
			}
			
			//printing from mid value till end ...
			for(int b=9 ; b>=9-i+1 ; b--){
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}