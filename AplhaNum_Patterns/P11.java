class P11{
	public static void main(String args[]){
		for(int i=1 ; i<=9 ; i=i+2){
			//spaces...
			for(int a=9-i ; a >=1 ; a--){
				System.out.print(" ");
			}
			
			//printing...
			for(int j=0+i ; j>=1 ; j--){
				System.out.print(("* "));}
			System.out.println();
		}
	}
}