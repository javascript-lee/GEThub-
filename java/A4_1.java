import  java.util.Scanner;
public class A4_1 {
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		int n=in.nextInt();
		if(n<=0){
			System.out.println("输入的数据有错误");
		}
		int sun=0;
		for(int i=1;i<=n;i++){
			sun+=i;
			System.out.println("1+2+3+4....+(n-1)+n:5"+sun);
		}
	}			
}

