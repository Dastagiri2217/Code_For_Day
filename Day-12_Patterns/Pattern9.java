import java.util.*;
class Pattern9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inverted Pyramid");
		System.out.println("\nEnter the n value  : ");
		int n = sc.nextInt();
		//first half
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		//second half
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i-1;j++){
			    System.out.print(" ");
			}
			for(int j=1;j<=(2*n-2*i+1);j++){
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
		    System.out.println();
		}
	}
}