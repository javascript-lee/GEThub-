import  java.util.*;
public class Test11{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		int A=in.nextInt();
		System.out.println("请再输入一个整数: ");
		int B=in.nextInt();
		System.out.println("请再继续输入一个整数: ");
		int C=in.nextInt();
		int D=A+B+C;
		if(A==B&&A==C){
			System.out.println("这三个数相等");
		}else if(D>=1000){
			System.out.println("这三个数的之和大于1000");
		}else{
			System.out.println("这三个数的之和不大于1000");
		}


	}



}