package j0617;

import java.util.Scanner; //import �ֻ�����Ű����.������Ű����..Ŭ������
//�ҷ��� Ŭ������ ��ġ�� import�� �ҷ�����
import j0617.sub.PrintTest;
public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;//���ڿ� �ޱ�->char ch;
		int n; //�ݺ��� Ƚ��
		Scanner sc=new Scanner(System.in);
		System.out.println("�ݺ��� ���ڿ��� �Է�?");
		str=sc.next();//nextLine()�� ����->���߿� ����
		
		System.out.println("�ݺ��� ���ڸ� �Է�?");
		n=sc.nextInt();//5
		
	
		/*(1)
		for(int i=1;i<=n;i++)
		System.out.print(str);*/
		/*�Ϲ� �޼��� ȣ�� ��(2)
		RepeatChar rc=new RepeatChar();
		rc.charPrint(str, n);
		*/
		//3) RepeatChar.charPrint(str, n);//�����޼���->Ŭ������.�����޼����(~)
		PrintTest.charPrint(str,n);//���� ���� ������ �Ⱥ�����. PrintTest ���� static �տ� public �ٿ��ְ� ��.
	}
	//�Ϲݸ޼���
	/*
	 * static void charPrint(String str,int n) {
		for(int i=1;i<=n;i++)
			System.out.print(str);
	}
	 */

}
