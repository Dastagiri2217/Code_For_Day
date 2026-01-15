import java.util.*;
class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				System.out.println("Not a Prime Number");
				flag = false;
				break;
			}
		}
		if(flag){
		System.out.println("Given number "+n+" is a prime number");
		}
	}
}