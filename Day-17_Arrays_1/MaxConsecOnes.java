import java.util.*;
public class MaxConsecOnes {
    public static int findMaxConsecOnes(int arr[],int n){
        int count = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max =Math.max(count,max);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = findMaxConsecOnes(arr,n);
        System.out.println("The maximum Consecutive ones in array are : "+count);
        sc.close();
    }
}
