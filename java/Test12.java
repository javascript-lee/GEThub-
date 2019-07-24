import  java.util.*;
public class Test12{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数: ");
		int shu=in.nextInt();
		switch(shu) {
			case 1:
			System.out.println("你出的是石头");
			break;
			case 2:
			System.out.println("你出的是布");
			break;
			case 3:
			System.out.println("你出的是剪刀");
			break;
			default:
			System.out.println("请输入正确的整数");
		}


	}


}