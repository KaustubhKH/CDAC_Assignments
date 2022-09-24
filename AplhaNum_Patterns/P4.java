class P7{
	public static void main(String args[]){
		for(int i=1 ; i<=5 ; i++){
			//spaces...
			for(int a=5-i ; a >=1 ; a--){
				System.out.print(" ");
			}
			
			//printing...
			for(int j=1 ; j<=i ; j++){
				System.out.print(j+(" "));}
			System.out.println();
		}
	}
}