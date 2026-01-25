import java.util.*;
class CountDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		if(n<0) n = Math.abs(n);
		/*
		int count = 0;
		while(n>0){
			//int digit = n%10;
			//System.out.print(digit+" ");
			count++;
			n /= 10;
		}
		*/
		int count = (int) Math.log10(n) + 1;//edge case 0 so if 0 return 1
		System.out.println("\nNumber of digits : "+count);
	}
}