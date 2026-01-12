import java.util.*;
class LCM{
	public static int findGCD(int n1,int n2){
		int num = Math.min(n1,n2);
		int ans = Integer.MIN_VALUE;
		for(int i=1;i<=num;i++){
			if(n1%i==0 && n2%i==0){
				ans = Math.max(ans,i);
			}
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int n2 = sc.nextInt();
		int gcd = findGCD(n1,n2);
		int ansLCM = (n1*n2)/gcd;
		System.out.println("The LCM of "+n1+" and "+n2+" is: "+ansLCM);
	}
}