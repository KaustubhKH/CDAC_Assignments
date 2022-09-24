class P13{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		//first half
		for(int i = 0 ; i < 5 ; i++){
			for(int j=0+i ; j > 0 ; j-- ){
				System.out.print("  ");
			}
			for (int a=5-i ; a>0 ; a-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//second half
		for(int i = 0 ; i < 4 ; i++){
			for(int j=3-i ; j > 0 ; j-- ){
				System.out.print("  ");
			}
			for (int a=2+i ; a>0 ; a-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}