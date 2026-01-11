import java.util.*;
class DivisorCountFor1ToN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int count = 0;
			for(int j=1;j<=i/j;j++){
				if(i%j == 0){
					if(j*j == i){
						count ++;
					}
					else{
						count += 2;
					}
				}
			}
			System.out.print(count+" ");
		}
	}
}