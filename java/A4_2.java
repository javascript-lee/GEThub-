import java.util.Random;
public class A4_2{
	public static void main(String[]args){
		Random rm=new Random();
		int ru=0;
		for(int i=1;i<=100;i++){
			int ag=rm.nextInt(101);
			ru+=ag;
			System.out.println("��"+i+"��ѧ���ɼ���"+ag); 
		}
		int av=ru/100;
		System.out.println("ƽ���ɼ���: "+av);
	}
}