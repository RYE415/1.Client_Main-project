package j0609;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=50;
		//(1)
//		if(su % 2 == 0) {
//			System.out.println(su + "�� ¦���Դϴ�.");
//		} else {
//			System.out.println(su + "�� Ȧ���Դϴ�.");
//		}
		switch(su%2) {//���ǽĿ� ���� case���� ���� ���� �� �ֵ��� ����
			case 0: //su�� 2�� ������ �� ������ 0�� ���
				System.out.println(su+"�� ¦��"); 
				break; //break�� �ݵ�� ��� ��!
			case 1: //su�� 2�� ������ �� �������� 1�� ���
				System.out.println(su+"�� Ȧ��");
				break;
		}
		System.out.println("switch ���� ����");
	}

}
