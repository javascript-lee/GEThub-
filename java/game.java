import java.util.Scanner;
public class game{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("--��ȭ��Ϸ--");
		System.out.println("���ȭ��1.���� 2.ʯͷ 3.����");
		int pk=in.nextInt();
		int computer=(int)(Math.random()*3)+1;
		String mak="����";
		String mak2="����";
		switch(pk){
			case 1:
			mak="����";
			break;
			case 2:
			mak="ʯͷ";
			break;
			case 3:
			mak="��";
			break;
		}
		switch(computer){
			case 1:
			mak2="����";
			break;
			case 2:
			mak2="ʯͷ";
			break;
			case 3:
			mak2="��";
			break;
		}	
		if(pk==computer){
			System.out.println("�������: "+mak+"���Գ�����: "+mak2+"--ƽ��");
		}else if(pk==1&&computer==2||pk==2&&computer==3||pk==3&&computer==1){
			System.out.println("�������: "+mak+"���Գ�����: "+mak2+"-_-������");
		}else{	
			System.out.println("�������:"+mak+"���Գ�����"+mak2+"^_^��Ӯ��");
		}
	}	
}