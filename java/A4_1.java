import  java.util.Scanner;
public class A4_1 {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������: ");
		int n=in.nextInt();
		if(n<=0){
			System.out.println("����������д���");
		}
		int sun=0;
		for(int i=1;i<=n;i++){
			sun+=i;
			System.out.println("1+2+3+4....+(n-1)+n:5"+sun);
		}
	}			
}

