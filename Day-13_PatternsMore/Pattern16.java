import java.util.*;
class Pattern16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int alpha = 65;
			for(int j=n;j>=i;j--){
				System.out.print(" "+(char)alpha++);
			}
			System.out.println();
		}
	}
}