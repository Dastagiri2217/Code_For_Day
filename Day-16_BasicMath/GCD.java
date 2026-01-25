import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n = sc.nextInt();
		System.out.println("Enter Second number : ");
		int n2 = sc.nextInt();
		int maxLoop = Math.min(n,n2);
		int ans = 1;
		for(int i=1;i<=maxLoop;i++){
			if(n%i == 0 && n2%i==0){
				ans = Math.max(ans,i);
			}
		}
		System.out.println("The GCD of "+n+" and  "+n2+" is : "+ans);
	}
}