import java.util.*;
class Pattern4{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Right angeled Pattern with numbers(same on row)");
		System.out.println("\nEnter the n value : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
		    System.out.println();
		}
	}
}
	