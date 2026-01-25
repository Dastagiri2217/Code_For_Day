import java.util.*;
class AllPrimesOfN{
	public static boolean isPrime(int n){
		for(int i=2;i<=n/i;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Prime Factors are : ");
		/*
		for(int i=2;i<=n/i;i++){ //time ~ O(sqrt(n) * 2 * sqrt(n)); //approx
			if(n%i==0){
				if(isPrime(i)){
					System.out.print(i+" ");
				}
				if(n/i != i){
					if(isPrime(n/i)){
						System.out.print(n/i+" ");
					}
				}
			}
		}
		*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<=n/i;i++){ //O(sqrt(n) * log(n))
			if(n%i==0){
				list.add(i);
			    while(n%i==0){
					n = n/i;
				}
			}
		}
		if(n!=1) list.add(n);
		for(int ele : list){
			System.out.print(ele+" ");
		}
	}
}