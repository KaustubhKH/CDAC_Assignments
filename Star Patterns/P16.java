class P16{
	public static void main(String[] args){
		System.out.println();
		
		// created a star pattern using for loops...
		
		for(int i=0; i < 5 ; i++){
			for(int a=4-i ; a>0 ; a--){System.out.print("  ");}
			for(int k=0 ; k<=i ; k++){
				
				//used if else for cutting out ...
				if(i==2 || i==3){
					if(k==0 || k==i){System.out.print("* ");}
					else{System.out.print("  ");}
				}
				else{System.out.print("* ");}
				}
			System.out.println();
		}
		System.out.println();
	}
}