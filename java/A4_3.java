import java.util.Scanner;
public class A4_3{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		for(;;){
			System.out.println("老婆你爱我吗？");
			String ags=in.next();
			if(ags.equals("不爱")){
				System.out.println("重新说");
			}else{
				break;
			}
			
		}
	}
}