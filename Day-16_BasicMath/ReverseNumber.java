import java.util.*;
class ReverseNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		if(n<0) n = Math.abs(n);
		int count = 0;
		int rev =0;
		while(n>0){
			int digit = n%10;
			rev = digit+rev*10;
			n /= 10;
		}
		System.out.println("\nReversed Number is : "+rev);
	}
}
	