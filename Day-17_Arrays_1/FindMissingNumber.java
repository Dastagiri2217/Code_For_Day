import java.util.Scanner;

public class FindMissingNumber {
    public static int findMissedNumber(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static int findMissedNumOpt(int arr[],int n,int sum){
       
        return n*(n+1)/2 - sum;
    }
    public static int findMissedUsingXor(int arr[],int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1;i<=n;i++){
            xor1 ^= i;
        }
        for(int i=0;i<arr.length;i++){
           xor2 ^= arr[i];
        }
        return xor1^xor2;
    }
    public static void main(String[] args) {
        //Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
        //Find the number(between 1 to N), that is not present in the given array..
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array : ");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int sum = 0;
        System.out.println("Enter the numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int num = findMissedNumber(arr,n);//BruteForce Iterate 1 to n -- Time O(n)
         num = findMissedNumOpt(arr,n,sum);//Optimal takes -- Time O(n) for input taking and adding to sum
         num = findMissedUsingXor(arr,n); //2nd optimal -- time O(n + n);
        System.out.println(num+" is the missed number");
        sc.close();
    }
}
