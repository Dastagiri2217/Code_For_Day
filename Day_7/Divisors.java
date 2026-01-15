import java.util.*;
class Divisors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int numDivisors = 0;
		int sum = 0;
		System.out.print("The Divisors are: ");
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				System.out.print(" "+i);
				numDivisors++;
				sum+=i;
			}
			if(i == n/2){
				System.out.print(" "+n);
			}
		}
		//sum += n;
		System.out.println("\nTotal Divisors are: "+numDivisors);
		System.out.println("total sum: "+sum);
		//or new logic
		/*
		System.out.println("New Logic");
		int count = 0;
		for(int i=1;i<=n/i;i++){
			if(n%i==0){
				if(i*i == n){
					count++;
				}
				else{
					count += 2;
				}
			}
		}
		System.out.println(count);
		*/
	}
}