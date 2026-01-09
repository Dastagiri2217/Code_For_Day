import java.util.*;
class PrimesUptoN{
	public static boolean IsPrime(int n){
		if(n==0||n==1){
			return false;
		}
		for(int i=2;i<=n/i;i++){
			if(n%i == 0){
				return false;
			}
		}
	     return true;
	}
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number  : ");
		int n = sc.nextInt();
		int i= 1;
		while(i<=n){
			if(IsPrime(i)){
				System.out.print(" "+i);
			}
			i++;
		}
	}
}
	