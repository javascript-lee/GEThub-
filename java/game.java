import java.util.Scanner;
public class game{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("--猜拳游戏--");
		System.out.println("请出拳（1.剪刀 2.石头 3.布）");
		int pk=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String mak="铁锤";
		String mak2="铁锤";
		switch(pk){
			case 1:
			mak="剪刀";
			break;
			case 2:
			mak="石头";
			break;
			case 3:
			mak="布";
			break;
		}
		switch(computer){
			case 1:
			mak2="剪刀";
			break;
			case 2:
			mak2="石头";
			break;
			case 3:
			mak2="布";
			break;
		}	
		if(pk==computer){
			System.out.println("你出的是: "+mak+"电脑出的是: "+mak2+"--平局");
		}else if(pk==1&&computer==2||pk==2&&computer==3||pk==3&&computer==1){
			System.out.println("你出的是: "+mak+"电脑出的是: "+mak2+"-_-你输了");
		}else{	
			System.out.println("你出的是:"+mak+"电脑出的是"+mak2+"^_^你赢了");
		}
	}	
}