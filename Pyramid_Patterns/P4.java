public class P4
{
	public static void main(String args[])
	{
		System.out.println();
		for(int i=1;i<=17;i++){
			
			//once again using if else for getting the odd rows..
			//but can be achieved through incrementing by 2..
			//just for the purpose of demonostration...
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
	}
}