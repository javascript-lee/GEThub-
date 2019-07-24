import java.util.Random;
public class A4_2{
	public static void main(String[]args){
		Random rm=new Random();
		int ru=0;
		for(int i=1;i<=100;i++){
			int ag=rm.nextInt(101);
			ru+=ag;
			System.out.println("第"+i+"号学生成绩是"+ag); 
		}
		int av=ru/100;
		System.out.println("平均成绩是: "+av);
	}
}