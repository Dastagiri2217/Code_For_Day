import java.util.*;
class SievePrimeAlgo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime[] = new boolean[n+1];
		for(int i=2;i<=n;i++){
			isPrime[i] = true;
			//System.out.println(isPrime[i]);
		}
		for(int i=2;i<=n/i;i++){
			if(isPrime[i]){
				for(int j = i*i;j<=n;j+=i){
					isPrime[j] = false;
				}
			}
		}
		//printing primes
		for(int i=2;i<=n;i++){
			if(isPrime[i]){
			    System.out.print(" "+i);
			}
		}
	}
}
	