import java.util.*;

public class Patterns{
	public static void main(String Args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcome to my Assignment Submission.");
		String[] patterns = new String[]{"Star","AlphaNum","Pyramid"};
		
		while(true){
			System.out.println();
			for (String choice : patterns){
				System.out.println(choice);
			}
			System.out.print("\nPlease choose one of the above patterns : --> ");
			String userinp = sc.next();
			
			if(userinp.equals("Star")){
				System.out.println("\nYou have chosen Star Patterns.");
				System.out.print("\nPlease choose one from the following patterns 1 to 16 --> ");
				int patternchoice = sc.nextInt();
				
				if (patternchoice == 1){
					System.out.println();
					for(int i=0;i<=4;i++){
						for(int j=0;j<=i;j++){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 2){
					System.out.println();
					for(int i=1;i<=5;i++){
						for(int j=5-i;j>=1;j--){
							System.out.print("  ");
						}
						for(int k=1;k<=i;k++){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 3){
					System.out.println();
					for(int i=4;i>=0;i--){
						for(int j=0;j<=i;j++){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 4){
					System.out.println();
					for(int i=1;i<=5;i++){
						for(int j=i-1;j>0;j--){
							System.out.print("  ");
						}
						for(int k=6-i;k>0;k--){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 5){
					System.out.println();
					for(int i=1;i<=9;i++){
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
					System.out.println();
				}
				
				else if (patternchoice == 6){
					System.out.println();
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
				
				else if (patternchoice == 7){
					System.out.println();
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
				
				else if (patternchoice == 8){
					System.out.println();
					for(int i=1 ; i<=5 ; i++ ){
						for(int j=1 ; j<=i ; j++ ){
							System.out.print("* ");
						}
						System.out.println();
					}
					for(int i=1 ; i<5 ; i++ ){
						for(int j=5-i ; j>0 ; j-- ){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 9){
					System.out.println();
					for(int i = 1 ; i <= 5 ; i++){
						for(int j=5-i ; j >= 1 ; j-- ){
							System.out.print("  ");
						}
						for(int k=1; k<=i ; k++){
							System.out.print("* ");
						}
						System.out.println();
					}
					for(int a = 1 ; a<5 ; a++){
						for (int b = a ; b>0 ; b-- ){
							System.out.print("  ");
						}
						for (int c = 5-a ; c>0 ;c--){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 10){
					System.out.println();
					for(int i = 0 ; i < 5 ; i++){
						for(int j=5-i ; j > 1 ; j-- ){
							System.out.print("  ");
						}
						for (int a=0 ; a<5 ; a++ ){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 11){
					for(int i = 0 ; i < 5 ; i++){
						for(int j=0+i ; j > 0 ; j-- ){
							System.out.print("  ");
						}
						for (int a=0 ; a<5 ; a++ ){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 12){
					System.out.println();
					for(int i = 0 ; i < 5 ; i++){
						for(int j=5-i ; j > 0 ; j-- ){
							System.out.print("* ");
						}
						System.out.println();
					}
					for(int a = 0 ; a<4 ; a++){
						for (int b = 2+a ; b>0 ; b-- ){
							System.out.print("* ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 13){
					System.out.println();
					for(int i = 0 ; i < 5 ; i++){
						for(int j=0+i ; j > 0 ; j-- ){
							System.out.print("  ");
						}
						for (int a=5-i ; a>0 ; a-- ){
							System.out.print("* ");
						}
						System.out.println();
					}
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
				
				else if (patternchoice == 14){
					System.out.println();
					for(int i=0; i < 5 ; i++){
						for(int j=0+i ; j>0 ; j--){System.out.print(" ");}
						for(int k=5-i ; k>0 ; k--){System.out.print("* ");}
						System.out.println();
					}
					for(int a=0; a < 4 ; a++){
						for(int b=3-a ; b>0 ; b--){System.out.print(" ");}
						for(int c=2+a ; c>0 ; c--){System.out.print("* ");}
						System.out.println();
					}
					System.out.println();
				}
				
				else if (patternchoice == 15){
					System.out.println();
					for(int i=0; i < 5 ; i++){
						for(int k=0 ; k<=i ; k++){
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
				
				else if (patternchoice == 16){
					System.out.println();
					for(int i=0; i < 5 ; i++){
						for(int a=4-i ; a>0 ; a--){System.out.print("  ");}
						for(int k=0 ; k<=i ; k++){
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
				
				else{System.out.print("\nInvalid Input! Please try again ...\n");}
			}
			
			
			
			else if(userinp.equals("AlphaNum")){
				System.out.println("You have chosen AlphaNum Patterns.");
				System.out.print("\nPlease choose one from the following patterns 1 to 18 --> ");
				int patternchoice = sc.nextInt();
				
				switch(patternchoice){
					case 1:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							for(int a=1 ; a<=i ; a++){
								System.out.print(a+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 2:
						System.out.println();
						for(int i=65 ; i<=69 ; i++){
							for(int a=65 ; a<=i ; a++){
								char z = (char) a;
								System.out.print(z+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 3:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							for(int a=1 ; a<=i ; a++){
								System.out.print("* ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 4:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							for(int j=1 ; j<=i ; j++){
								System.out.print(i+(" "));
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 5:
						System.out.println();
						for(int i=65 ; i<=69 ; i++){
							for(int a=65 ; a<=i ; a++){
								char z = (char) i;
								System.out.print(z+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 6:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							//spaces...
							for(int a=5-i ; a >=1 ; a--){
								System.out.print("  ");
							}
							
							//printing...
							for(int j=0+i ; j>=1 ; j--){
								System.out.print(("* "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 7:
						System.out.println();
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
						System.out.println();
						break;
					case 8:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							//spaces...
							for(int a=5-i ; a >=1 ; a--){
								System.out.print(" ");
							}
							
							//printing...
							for(int j=5-i+1 ; j<=5 ; j++){
								System.out.print(j+(" "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 9:
						System.out.println();
						for(int i=65,k=0 ; i<=69 ; i++,k++){
							for(int j=4-k ; j>0 ; j--){System.out.print(" ");}
							for(int a=65 ; a<=i ; a++){
								char z = (char) a;
								System.out.print(z+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 10:
						System.out.println();
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
						System.out.println();
						break;
					case 11:
						System.out.println();
						for(int i=1 ; i<=9 ; i=i+2){
							//spaces...
							for(int a=9-i ; a >=1 ; a--){
								System.out.print(" ");
							}
							
							//printing...
							for(int j=0+i ; j>=1 ; j--){
								System.out.print(("* "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 12:
						System.out.println();
						for(int i=1 ; i<=5 ; i++){
							//spaces...
							for(int a=5-i ; a >=1 ; a--){
								System.out.print(" ");
							}
							
							//printing...
							for(int j=0+i ; j>=1 ; j--){
								System.out.print(i+(" "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 13:
						System.out.println();
						for(int i=65,k=0 ; i<=69 ; i++,k++){
							for(int j=4-k ; j>0 ; j--){System.out.print(" ");}
							for(int a=65 ; a<=i ; a++){
								char z = (char) i;
								System.out.print(z+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 14:
						System.out.println();
						for(int i=0 ; i<5 ; i++){
							//printing...
							for(int j=1 ; j<=5-i ; j++){
								System.out.print(j+(" "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 15:
						System.out.println();
						for(int i=0 ; i<5 ; i++){
							//printing...
							for(int j=5 ; j>=1+i ; j--){
								System.out.print(j+(" "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 16:
						System.out.println();
						for(int i=5 ; i>0 ; i--){
							
							//printing...
							for(int j=5 ; j>=i ; j--){
								System.out.print(j+(" "));}
							System.out.println();
						}
						System.out.println();
						break;
					case 17:
						System.out.println();
						int value = 1;
						for(int i = 1; i <= 5; i++){
							for(int j = 1; j <= i; j++){
								System.out.print(value+" ");
								value++;
							}
							System.out.println();
						}
						System.out.println();
						break;
					case 18:
						System.out.println();
						for(int i=0 ; i<5 ; i++){
							for(int j=65 ; j<=69-i ; j++){
								char z = (char) j;
								System.out.print(z+(" "));
							}
							System.out.println();
						}
						System.out.println();
						break;
					default:
						System.out.print("\nInvalid Input! Please try again ...\n");
				}
				 
			}
			
			
			
			else if(userinp.equals("Pyramid")){
				System.out.println("You have chosen Pyramid Patterns.");
				System.out.print("\nPlease choose one from the following patterns 1 to 7 --> ");
				int patternchoice = sc.nextInt();
				
				switch(patternchoice){
					case 1:
						System.out.println();
						for(int i=1;i<=9;i++){
							for(int a=9-i;a>0;a--){
								System.out.print(" ");
							}
							for(int j=0;j<i;j++){
								System.out.print(i+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
						
					case 2:
						System.out.println();
						for(int i=1;i<=9;i++){
							for(int a=9-i;a>0;a--){
								System.out.print(" ");
							}
							for(int j=1;j<i+1;j++){
								System.out.print(j+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
						
					case 3:
						System.out.println();
						for(int i=1;i<=9;i++){
							for(int a=9-i;a>0;a--){
								System.out.print(" ");
							}
							for(int j=1;j<i+1;j++){
								System.out.print("* ");
							}
							System.out.println();
						}
						System.out.println();
						break;
						
					case 4:
						System.out.println();
						for(int i=1;i<=17;i++){
							if(i%2==0){
								continue;	
							}
							else{
								for(int a=17-i;a>0;a--){
									System.out.print(" ");
								}
								for(int j=1,c=-(i-1);j<i+1;j++,c=c+2){
									if(j>(i/2)+1){
										System.out.print((j-c)+" ");
										}
									else{System.out.print(j+" ");}
								}
								System.out.println();
							}	
						}
						System.out.println();
						break;
						
					case 5:
						System.out.println();
						for(int i=1 ; i<=9 ; i++){
							
							//spaces...
							for(int s=9-i ; s>0 ; s--){System.out.print("  ");}
							
							//printing before mid value occurs ...
							for(int a=9-i+1 ; a<9 ; a++){
								System.out.print(a+" ");
							}
							
							//printing after mid value occurs ...
							for(int b=9 ; b>=9-i+1 ; b--){
								System.out.print(b+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
						
					case 6:
						System.out.println();
						for(int i=0 ; i<9 ; i++){
							for(int a=0+i ; a>0 ; a--){
								System.out.print(" ");
							}
							for(int j=9-i; j>=1 ; j--){
								System.out.print("* ");
							}
							System.out.println();
						}
						System.out.println();
						break;
					
					case 7:
						System.out.println();
						for(int i=0 ; i<9 ; i++){
							for(int a=0+i ; a>0 ; a--){
								System.out.print(" ");
							}
							for(int j=9-i,k=9-i ; j>=1 ; j--){
								System.out.print(k+" ");
							}
							System.out.println();
						}
						System.out.println();
						break;
						
					default:
						System.out.print("\nInvalid Input! Please try again ...\n");
				}
			}
			
			
			
			else {
				System.out.println("\nInvalid Input!\nPlease try again.");
			}
			
			System.out.print("\nDo you want to continue ? [yes/no] --> ");
			String response = sc.next();
			
			switch(response){
				case "yes" :
					System.out.println("\nYou have been redirected to Main Menu.");
					continue;
				case "no" :
					System.exit(0);
				default:
					System.out.println("\nInvalid Input !\tYou have been redirected to Main Menu.");
			}
		
		}
	}
}