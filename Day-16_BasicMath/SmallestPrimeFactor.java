import java.util.*;
class SmallestPrimeFactor{
	public static void applySieveOfEratosthenes(int arr[]){
		int n = arr.length;
		for(int i=2;i<=n/i;i++){
			if(arr[i] == i){
				for(int j=i*i;j<=arr.length;j+=i){
					arr[j] = i;
				}
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Queries : ");
		int Q = sc.nextInt();
		int arr[] = new int[Q];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
			max = Math.max(max,arr[i]);
		}
		int sieve[] = new int[max+1];
		for(int i=2;i<sieve.length;i++){
			sieve[i] = i;
		}
		applySieveOfEratosthenes(sieve);
		
		//find smallest prime factors
		for(int i=0;i<arr.length;i++){
			int num = arr[i];
			System.out.print("The SPF are : ");
			while(num!=1){
				System.out.print(sieve[num]+" ");
				num = num/sieve[num];
			}
			System.out.println("\n");
		}
	}
}