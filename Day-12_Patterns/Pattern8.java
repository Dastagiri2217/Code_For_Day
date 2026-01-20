import java.util.*;
class Pattern8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inverted Pyramid");
		System.out.println("\nEnter the n value  : ");
		int n = sc.nextInt();
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