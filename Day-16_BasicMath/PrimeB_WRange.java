import java.util.*;
class PrimeB_WRange{
	public static int[] findPrimesArray(int arr[]){ //Time = O(N log log N)
		int n = arr.length-1;
		for(int i=2;i<=n/i;i++){
		    if(arr[i]==1){
				for(int j=i*i;j<=n;j+=i){
					arr[j] = 0;
				}
			}
		}
		return arr;
	}
	public static int [] findPrefixCount(int arr[]){ //time = O(n);
		for(int i=1;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i];
		}
		return arr;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Queries : ");
		int Q = sc.nextInt();
		int arr[][] = new int[Q][2];
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j] = sc.nextInt();
				max = Math.max(max,arr[i][j]);
			}
		}
		int primes[] = new int[max+1];
		for(int i=0;i<primes.length;i++){
			primes[i] = 1;
		}
		primes[0]=0;
		primes[1] = 0;
		findPrimesArray(primes);
		int prefixCount[] = findPrefixCount(primes);
		for(int i=0;i<arr.length;i++){ //time= O(Q);
		    int l = arr[i][0];
			int r = arr[i][1];
			System.out.println(prefixCount[r]-prefixCount[l]+1);
		}
		//Over all time : O(N log log N + Q)
	}
}