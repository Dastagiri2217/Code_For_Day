import java.util.*;
class RangeSumQuery{
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
		System.out.println("Enter the Query Left and Right points");
		int l = sc.nextInt();
		int r = sc.nextInt();
		int [] prefixSum = findPrefixSumArray(arr,n);
		int ans = 0;
		if(l==0){
			ans = prefixSum[r];
		}
		else{
			ans = prefixSum[r] - prefixSum[l-1];
		}
		System.out.println("Sum : "+ans);
	}
}