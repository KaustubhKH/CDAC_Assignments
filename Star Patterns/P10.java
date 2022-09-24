class P10{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		for(int i = 0 ; i < 5 ; i++){
			
			//spaces...
			for(int j=0+i ; j > 0 ; j-- ){
				System.out.print("  ");
			}
			
			//star printing...
			for (int a=0 ; a<5 ; a++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}