import  java.util.*;
public class Test11{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������: ");
		int A=in.nextInt();
		System.out.println("��������һ������: ");
		int B=in.nextInt();
		System.out.println("���ټ�������һ������: ");
		int C=in.nextInt();
		int D=A+B+C;
		if(A==B&&A==C){
			System.out.println("�����������");
		}else if(D>=1000){
			System.out.println("����������֮�ʹ���1000");
		}else{
			System.out.println("����������֮�Ͳ�����1000");
		}


	}



}