class P7{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops
		//although similar techniques have been used as logic..
		//but we can use uncr by 2 to shorten this program...
		//instead of using if else ...
		
		for(int i=1;i<=7;i++){
			if(i%2==0){
				continue;
			}
			else{
				for(int k=9-i;k>0;k--){
					System.out.print(" ");
				}
				for(int j=0;j<i;j++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		//printing other half
		for(int i=9;i>=1;i--){
			if(i%2==0){
				continue;
			}
			else{
				for(int k=9-i;k>0;k--){
					System.out.print(" ");
				}
				for(int j=i;j>0;j--){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}