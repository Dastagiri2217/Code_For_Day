import java.util.*;
class Problem2{
	//function to calculate GCD
	public static int findGCD(int num1,int num2){
		while(num2!=0){
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num1;
	}
	//Replace Array with GCD of Prefix
	public static void findGcdAndReplacePrefix(int arr[]){
		
		for(int i=1;i<arr.length;i++){
			arr[i] = findGCD(arr[i-1],arr[i]); //cal gcd and replace with prefix
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements to the array : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		findGcdAndReplacePrefix(arr);
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
	