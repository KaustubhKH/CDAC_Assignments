import java.util.*;
public class Question5 {
	
	static int[] monthsLoop(int days, int months, String leapYear){
		int[] retrnAns = new int[2];
		for(int i=1; i<=12; i++){
			if(i==2 && months==1){
				if(leapYear.equals("y")){
					if(days>=29){
						days-=29;
						months++;
						continue;
					}
					else{
						break;
					}
				}
				else if (leapYear.equals("n")){
					if(days>=28){
						days-=28;
						months++;
						continue;
					}
					else{
						break;
					}
				}
				else{
					System.out.println("\nInvalid Input!");
					main(null);
				}
					}
			else if(i%2!=0 && days>=31){
				days-=31;
				months++;
			}
			else if(i%2==0 && days>=30){
				days-=30;
				months++;
			}
				}
		retrnAns[0]=months;
		retrnAns[1]=days;
		return retrnAns;
	}
	
	static void cal(int Days, String leapYear){
		int months=0,years=0,days = 0,flag = 0;
		int[] ans = new int[2];
		days=Days;
		do{
			//System.out.println(days);
			days-=365;
			if(days<0){
				if (flag==0){
					days=Days;
					ans = monthsLoop(days,months,leapYear);
				}
				else{
					days+=365;
					ans = monthsLoop(days,months,leapYear);
				}
				System.out.println("\nNo. of years : "+years+"\nNo. of months : "+ans[0]+"\nNo. of days : "+ans[1]);
				break;
			}
			else if (days>0){
				years++;
				flag++;
			}
			else{
				years++;
				flag++;
				System.out.println("\nNo. of years : "+years+"\nNo. of months : "+months+"\nNo. of days : "+days);
				break;
			}
		}
		while(days>0);
		return ;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlease give no. of days : ");
		int days = sc.nextInt();
		System.out.print("\nPlease tell does it includes a leap year [y/n] : ");
		String leap = sc.next();
		cal(days,leap);
	}
}