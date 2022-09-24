class P5{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops
		for(int i=1;i<=9;i++){
			
			//used if else ...although this can be solved by
			//increasing the incr by 2...
			//have shown this in further examples...
			if(i%2==0){
				continue;
			}
			else{
				//spaces...
				for(int k=9-i;k>0;k--){
					System.out.print(" ");
				}
				//star printing...
				for(int j=0;j<i;j++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}