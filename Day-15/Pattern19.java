import java.util.*;
class Pattern19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int spaces = 0;
		//upper
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
		    for(int j=n;j>=i;j--){
				System.out.print("*");
			}
			spaces +=2;
		    System.out.println();
		}
		//lower
		spaces = 2*(n-1); 
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			spaces -= 2;
		}
	}
}
	