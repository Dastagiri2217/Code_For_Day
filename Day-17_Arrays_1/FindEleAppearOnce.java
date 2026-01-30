import java.util.Scanner;
import java.util.HashSet;
public class FindEleAppearOnce {
    public static int findEleAppearedOnce(int arr[],int n){
        for(int i=0;i<n;i++){
            int ele = arr[i];
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==ele){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
    public static int findEleUsingHashSet(int arr[],int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else{
                set.remove(arr[i]);
            }
        }
        return (int) set.iterator().next();
    }
    private static int findEleUsingXor(int arr[],int n){
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= arr[i];
        }
        return xor;
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
        /* 
        //Brute Force take each element and count how many times it repeated if count == 1 using Linear Search then print
        int ele = findEleAppearedOnce(arr,n);//Time O(n*n) space O(1)
        System.out.println(ele+" is the element that is appeared only once");
        */

       /* 
       Better Appraoch is that while iterating the array if the element appeared first then store it inside set 
       if the hashset already has that ele remove that ele from hashset
        int ele = findEleUsingHashSet(arr,n);// Time : O(n) and spcae O(n)
        System.out.println(ele+" is the element that appeared only once");
       */

        /*Optimal Approach Using Xor 
        here all ele repeated twice only single ele repeated once
        so by using xor (a^a = 0) */
        int ele = findEleUsingXor(arr,n);
        System.out.println(ele+" is the element that appeared only once");
    }
}
