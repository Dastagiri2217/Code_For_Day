import java.util.*;
class PrimeNumber{
	public static boolean IsPrime(int n){
		if(n==1||n==0){
			return false;
		}
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		if(IsPrime(n)){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}
	}
}