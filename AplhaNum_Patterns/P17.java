class P17{
	public static void main(String args[]){
		
		//dynamic variable assignment/initialization ...
		int value = 1;
		//done for maintaining a counter which will be printed...
		
		//nested for loops...
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(value+" ");
				
				//printing the counter value...
				value++;
			}
			System.out.println();
		}
	}
}