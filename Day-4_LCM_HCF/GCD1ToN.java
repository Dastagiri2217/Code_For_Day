import java.util.*;
class GCD1ToN{
	public static int findGCD(int a,int b){
		while(b!=0){
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int ans = 0;
		if(n>=2){
			ans = 1;
		}
		else{
			System.out.println("GCD is : "+1);
		}
		
		for(int i=3;i<=n;i++){
			//gcd of 1,anything always 1 so no use of this stuff
			 ans = findGCD(ans,i);
		}
		System.out.println("GCD is : "+1);
	}
}