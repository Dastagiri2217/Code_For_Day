import java.util.*;
class MajorityElement{
    public static int findMajorityElement(int arr[],int n){
        int ele = 0,count = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                ele = arr[i];
                count  =1;
            }
            else if(ele == arr[i]){
                count++;
            }
            else{
                count --;
            }
        }
        int freq = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele){
                freq++;
            }
        }
        if(freq>n/2){
            return ele;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findMajorityElement(arr,n);
        if(ans!=-1){
            System.out.println("Majority element in given array is : "+ans);
        }
        else{
            System.out.println("No Majorty element found");
        }
        sc.close();
    }
}