import java.util.*;
class SortZerosOnesTwos {
    public static void displayArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countAndOverride(int arr[]){
        int zeros = 0,ones=0,twos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<zeros){
                arr[i] = 0;
            }
            else if(i<ones+zeros){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
        }
        System.out.println("After arranging zeros ones and twos: ");
        displayArray(arr, arr.length);
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
        /*Appraoch 1 use sort alog
        System.out.println("Before Sorting: ");
        displayArray(arr, n);
        Arrays.sort(arr);
        System.out.println("After Sorting zeros ones and twos : ");
        displayArray(arr, n);
        //Time O(n*log n) and Space O(1) as per java
        */

        /*Appraoch 2 count 0s 1s and 2s and override count number of time in original array
         */
        countAndOverride(arr);
     }
}
