import java.util.*;
class NumDivisors{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		//Divisor is a number which gives remainder when we divide
		int count = 0;
		int sum = 0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				System.out.print(" "+i);
				sum += i;
				count++;
			}
		}//runs in O(n) time no space consumes
		System.out.println("\nNumber of Divisors for "+n+" are : "+count);
		System.out.println("Sum of all Divisors: "+sum);
		//Second way an optimized
		count = 0;
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				if(i*i == n){
					count++;
				}
				else{
					count += 2;
				}
			}
		}
	}
}	