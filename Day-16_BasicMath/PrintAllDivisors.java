import java.util.*;
class PrintAllDivisors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<=n/i;i++){ //O(sqrt(n));
			if(n%i==0){
				if(i*i==n){
					al.add(i);
				}
			    else{
				al.add(i);
				al.add(n/i);
			    }
			}
		}
		Collections.sort(al); //O(nlogn) n--number of factors
		for(int ele:al){
			System.out.print(ele+" ");
		}
	}
}
	