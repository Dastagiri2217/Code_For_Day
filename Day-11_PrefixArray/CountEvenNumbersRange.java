import java.util.*;
class CountEvenNumbersRange{
	public static int[] countEvenNumbers(int arr[],int n){
		int ans[] = new int[n];
		if(arr[0]%2==0){
			ans[0] = 1;
		}
		else{
			ans[0] = 0;
		}
		for(int i=1;i<n;i++){
			if(arr[i]%2==0){
				ans[i] = ans[i-1]+1;
			}
			else{
				ans[i] = ans[i-1];
			}
		}
		return  ans;
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
		System.out.println("Enter the range ");
		int l = sc.nextInt();
		int r = sc.nextInt();
		if (l < 0 || r >= n || l > r) {
            System.out.println("Invalid range");
            return;
        }
		int prefixCount [] = countEvenNumbers(arr,n);
		if(l==0){
			System.out.println("Number of even numbers in given range is : "+prefixCount[r]);
		}
		else{
			int count = prefixCount[r] - prefixCount[l-1];
			System.out.println("Number of even numbers in given range is : "+count);
	    }
	}
}