import java.util.*;
class GCD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		int maxDivisor = 0;
		for(int i=1;i<=Math.min(n1,n2)/2;i++){
			if(n1%i==0 &&  n2%i==0){
				maxDivisor = Math.max(maxDivisor,i);
			}
		}
		System.out.println(maxDivisor);
	}
}