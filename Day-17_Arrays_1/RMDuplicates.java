import java.util.HashSet;
import java.util.Scanner;

public class RMDuplicates {
    public static int[] removeDuplicatesAndCount(int arr[]){
        HashSet<Integer> set = new HashSet<Integer>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int index = 0;
        for(int ele:set){
            arr[index++] = ele;
        }
        for(int i=index;i<arr.length;i++){
            arr[i] = 0;
        }
        return arr;
    }
    public static int [] removeDuplicatesAndCount2Pointer(int arr[]){
        int n = arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int j=i+1;j<n;j++){
            arr[j] = 0;
        }
        return arr;
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
        //removeDuplicatesAndCount(arr);//by using HashSet time O(n log n) and Space O(n)
        removeDuplicatesAndCount2Pointer(arr);
        int idx = 0;
        while(arr[idx]!=0){
            System.out.print(arr[idx]+" ");
            idx++;
        }
    }
}
