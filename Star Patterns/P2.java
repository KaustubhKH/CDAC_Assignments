class P2{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using two for loops
		for(int i=1;i<=5;i++){
			
			//spaces...
			for(int j=5-i;j>=1;j--){
				System.out.print("  ");
			}
			
			//printing stars...
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}