class P10{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		//first half
		for(int i = 1 ; i <= 5 ; i++){
			for(int j=5-i ; j >= 1 ; j-- ){
				System.out.print("  ");
			}
			for(int k=1; k<=i ; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//second half
		for(int a = 1 ; a<5 ; a++){
			for (int b = a ; b>0 ; b-- ){
				System.out.print("  ");
			}
			for (int c = 5-a ; c>0 ;c--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
}
}