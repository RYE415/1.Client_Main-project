package j0609;

public class IFtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����-> ����ڷ� ���� �Է� -> scanner��ü(6�� ������ �Ŀ� ���)
		// ¦��,Ȧ�� �Ǻ�(��� /2==>2�� ���, /3==0(3�� ���)
		//ctrl+a (��ü������) -> ctrl+shift+f ->�ڵ����ı�� => �鿩���� �˾Ƽ� ����
		System.out.println("if��ø��");
		int su = 90;
		// ����1) su -> 1~100������ ������ ����ִ� ��� -> ¦��,Ȧ��
		// ����2) ¦��, Ȧ�� �Ǻ��ϱ�
		// if (su%2==1) //���ǽ�(����,������(����,��))
		// System.out.println(su+"�� ¦���Դϴ�.");
		// �ϳ��� ���ǽĿ� ���� ó���ؾ� �� ������ �ϳ� �̻��� �� { }
		// % :������, su%2==0 -> su�� 2�� ������ �� �������� 0
		if ((su >= 1) && (su <= 100)) {// 1~100������ ����
			if (su % 2 == 0) {
				System.out.println(su + "�� ¦���Դϴ�.");
			} else {
				System.out.println(su + "�� Ȧ���Դϴ�.");
			}
		} else {
			System.out.println("su���� 1~100������ ���� �Է��� ����");
		} // else
		System.out.println("if��������");
	}// main

}// class
