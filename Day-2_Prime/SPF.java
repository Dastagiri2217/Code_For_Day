import java.util.*;
class SPF{
	//It takes O(n) 
	public static boolean checkIsPrime(int n){
		if(n==0 || n == 1){
			return false;
		}
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		int ans = Integer.MAX_VALUE;
		for(int i=2;i<=n;i++){
			if(n%i==0){
				if(checkIsPrime(i)){
					ans  = Math.min(ans,i);
				}
			}
		} //takes O(n^2) time and no space
		*/
		//Optimized Way it takes only O(Sqrt(N)) time and no space
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				System.out.println("The Smallest Prime Factor : "+i);
			}
		}
		//System.out.println("The Smallest Prime Factor : "+ans);
	}
}
	