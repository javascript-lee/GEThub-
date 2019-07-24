import  java.util.*;
public class Test10{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入数字: ");
		int nuy=in.nextInt();
		if(nuy<=0){
			System.out.println("生成了一只白猪");
		}else if(nuy<=1){
			System.out.println("生成了一只黑猪");
		}else if(nuy<=2){
			System.out.println("生成了一只红猪");
		}else{
			System.out.println("生成了一只变形猪");
		}
		System.out.println("对不对");

	}

}