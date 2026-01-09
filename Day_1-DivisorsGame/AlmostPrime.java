import java.util.*;
class AlmostPrime{
	public static boolean IsOnlyTwoFactors(int n){
		int count =0;
		for(int i=1;i<=n/i;i++){
			if(n%i==0){
				if(i*i == n){
					count++;
				}
				else{
					count+=2;
				}
			}
		}
		if(count == 2) {return true;}
		else{ return false;}
	}
	public  static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++){
			if(IsOnlyTwoFactors(i)){
				System.out.print(" "+i);
				count++;
			}
		}
		System.out.println("\n Total number of primes upto n are "+n+" which has only 2 factors");
    }
}