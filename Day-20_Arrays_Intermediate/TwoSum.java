import java.util.*;
class TwoSum {
    public static boolean pairExists(int arr[],int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int ele = target - arr[i];
            for(int j=i+1;j<n;j++){
                if(ele == arr[j]){
                    System.out.println("The Pair is : "+arr[i]+" and  : "+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean twoSumHashSet(int arr[],int target){
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            int ele = target - arr[i];
            if(set.contains(ele)){
                System.out.println("Pair is "+arr[i]+" and "+ele);
                return true;
            }
        }
        return false;
    }
    public static boolean twoPointerTwoSum(int arr[],int target){
        int n = arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("Pair : "+arr[i]+" and "+arr[j]);
                return true;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
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
        System.out.println("Enter the Target : ");
        int target = sc.nextInt();
        /* 
        if(pairExists(arr,target)){ //Time O(n*n); space O(1) checking each pair
            System.out.println("Pair Exists");
        }
        else{
            System.out.println("No Such pair Exists");
        }
        */
        /* 
        //2ND approach using hashset
        if(twoSumHashSet(arr,target)){
            System.out.println("Pair Exists");
        }
        else{
            System.out.println("No Such Pair Exists");
        }
            */
        //3rd approach using TwoPointer + sorting
        Arrays.sort(arr);
        if(twoPointerTwoSum(arr,target)){
            System.out.println("Pair Exists");
        }
        else{
            System.out.println("No such Pair Exists");
        }
        sc.close();
    }
}
