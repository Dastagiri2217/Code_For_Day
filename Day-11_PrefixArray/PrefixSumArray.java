import java.util.*;
class PrefixSumArray{
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int [] findPrefixSumArray(int arr[],int n){
		int ans[] = new int[n];
		ans[0] = arr[0];
		for(int i=1;i<n;i++){
			ans[i] = ans[i-1]+arr[i];
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements to the array : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Orginal Array : ");
		printArray(arr);
		int [] prefixSum = findPrefixSumArray(arr,n);
		System.out.print("Prefix-Sum Array : ");
		printArray(prefixSum);
	}
}