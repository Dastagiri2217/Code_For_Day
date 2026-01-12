import java.util.*;
class CheckCOPRIME{
	public static int FindGCD(int a,int b){
		while(b!=0){
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	public static boolean checkCoprimes(int n1,int n2){
		//1st method
		/*
		int ans = Integer.MAX_VALUE;
		int max = Math.max(n1,n2);
		for(int i=2;i<=max;i++){
			if(n1%i ==0 && n2%i==0){
				return false;
			}
		}
		return true;
		*/
		//second method
		  int gcd = FindGCD(n1,n2);
		  return gcd == 1;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();
		if(checkCoprimes(n1,n2)){
			System.out.println("Two number are coprimes with gcd = 1");
		}
		else{
			System.out.println("Not coprimes ");
		}
	}
}