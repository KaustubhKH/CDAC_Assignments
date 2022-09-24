 class P10
    {
        public static void main(String args[]){
			for(int i=65,k=0 ; i<=69 ; i++,k++){
				
				//spaces ...
				for(int j=4-k ; j>0 ; j--){
					System.out.print(" ");
					}
					
				//print ...
				for(int b=69-k ; b<=69 ; b++){
					char z = (char) b;
					System.out.print(z+" ");
				}
				System.out.println();
			}
		}
    }