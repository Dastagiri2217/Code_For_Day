import java.util.*;
class ReduceFraction{
	public static int findGCD(int num1,int num2){
		while(num2!=0){
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the denominator : ");
		int n2 = sc.nextInt();
		int gcd = findGCD(n1,n2);
		System.out.println("GCD is : "+gcd);
		n1 /= gcd;
		n2 /= gcd;
		System.out.println("Reduced Fraction = " + n1 + "/" + n2);
	}
}