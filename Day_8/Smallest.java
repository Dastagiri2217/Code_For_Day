//find smallest number among four numbers using if statement
import java.util.*;
class Smallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int args[0] = sc.nextInt();
		int args[1] = sc.nextInt();
		int args[2] = sc.nextInt();
		int args[3] = sc.nextInt();
		int small = args[0];
		if(args[1]<small){
			small = args[1];
		}
		if(args[2]<small){
			small = args[2];
		}
		if(args[3]<small){
			small = d;
		}
		System.out.println("smallest is : "+small);
	}
}