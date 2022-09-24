class P4{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using two for loops
		for(int i=1;i<=5;i++){
			
			//spaces...
			for(int j=i-1;j>0;j--){
				System.out.print("  ");
			}
			
			//star printing...
			for(int k=6-i;k>0;k--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}