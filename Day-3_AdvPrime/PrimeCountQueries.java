import java.util.*;
class PrimeCountQueries{
	public static boolean[] PrimesUptoMax(int num){
		boolean ans [] = new boolean[num+1];
		for(int i=2;i<=num;i++){
			ans[i] = true;
		}
		for(int i=2;i<=num/i;i++){
			if(ans[i]){
				for(int j = i*i ;j<=num;j+=i){
					ans[j] = false;
				}
			}
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;
		System.out.println("Enter the Elements : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			max = Math.max(max,arr[i]);
		}
		// logic find max in array and get the max number and build an array which has primes upto max
		boolean [] primes = PrimesUptoMax(max);
		//takes O(n^2) time so optimize using prefix sum and no space
		/*
		for(int i=0;i<n;i++){
			int count = 0;
			for(int j=0;j<=arr[i];j++){
				if(primes[j] == true){
					count ++;
				}
			}
			System.out.print(" "+count);
		} */
		int prefixCount[] = new int[max+1];
		//it takes O(n) and O(max) space
		for(int i =1;i<=max;i++){
			prefixCount[i] = prefixCount[i-1]+(primes[i]?1:0);
		}
		System.out.println("Number of Primes : ");
		for(int i=0;i<n;i++){
			System.out.print(" "+prefixCount[arr[i]]);
		}
	}
}
	