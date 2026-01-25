import java.util.*;
class EuclideanAlgoGCD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n = sc.nextInt();
		System.out.println("Enter Second number : ");
		int n2 = sc.nextInt();
		while(n>0 && n2>0){
			if(n>n2){
			   n = n%n2;
			}
		    else{
			n2 = n2%n;
			}
		}
		if(n==0){
			System.out.println("GCD is : "+n2);
		}
		else{
			System.out.println("GCD is : "+n);
		}
	}
}