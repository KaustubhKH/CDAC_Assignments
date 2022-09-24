class P8{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		//first half
		for(int i=1 ; i<=5 ; i++ ){
			for(int j=1 ; j<=i ; j++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//second half
		for(int i=1 ; i<5 ; i++ ){
			for(int j=5-i ; j>0 ; j-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
}
}