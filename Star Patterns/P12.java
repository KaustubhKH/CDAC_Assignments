class P12{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		
		//first half
		for(int i = 0 ; i < 5 ; i++){
			for(int j=5-i ; j > 0 ; j-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//second half
		for(int a = 0 ; a<4 ; a++){
			for (int b = 2+a ; b>0 ; b-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}