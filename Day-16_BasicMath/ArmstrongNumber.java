import java.util.*;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int og = n;
		int sum = 0;
		int count = (int)Math.log10(og)+1;
		while(n>0){
			int digit = n%10;
			sum += Math.pow(digit,count);
			n /= 10;
		}
		if(sum == og){
			System.out.println("The given number "+og+" is an armstrong number");
		}
		else{
			System.out.println("The given number "+og+" is not an armstrong number");
		}
	}
}