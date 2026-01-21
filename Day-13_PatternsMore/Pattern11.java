import java.util.*;
class Pattern11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Right angeled pyramid with binary launguage");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					if(j%2!=0){
						System.out.print("1 ");
					}
					else{
						System.out.print("0 ");
					}
				}
				else{
					if(j%2==0){
						System.out.print("1 ");
					}
					else{
						System.out.print("0 ");
					}
				}
			}
			System.out.println();
		}
	}
}