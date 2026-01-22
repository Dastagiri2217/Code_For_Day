import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c){
			System.out.println("a is greater");
			return;
		}
		if(b>c && b>a){
            System.out.println("b is greater");
			return;
        }
        System.out.println("c is greater");
    }
}	