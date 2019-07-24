import java.util.*;
public class Test9{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的年龄: ");
		int HDR=in.nextInt();
		System.out.println("请输入你的月薪: ");
		int moeny=in.nextInt();
		if(HDR<25&&moeny>10000){
			System.out.println("哇，你真是高富帅啊？");
		}

	}


}