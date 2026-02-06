import java.util.Scanner;
public class LeadersInArray {
    public static void findLeadersOfArray(int arr[],int n){
        int maxUpto = arr[n-1];
        System.out.print(maxUpto+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxUpto){
                maxUpto = arr[i];
                System.out.print(maxUpto+" ");
            }
        }
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
        findLeadersOfArray(arr,n);
        sc.close();
    }
}
