package j0609;
//���� if�� ��� switch ����
public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=6;
		//(1)
//		if(su % 2 == 0) {
//			System.out.println(su + "�� ¦���Դϴ�.");
//		} else {
//			System.out.println(su + "�� Ȧ���Դϴ�.");
//		}
		switch(su) {//���ǽĿ� ���� case���� ���� ���� �� �ֵ��� ����
			case 0: case 2: case 4:
			case 6:
			case 8: //case 0 To 10 (X)
			case 10: //case�� ������ ������ �� ���
				System.out.println(su+"�� ¦��"); 
				break; //break�� �ݵ�� ��� ��!
			case 1: case 3: case 5: case 7: case 9:
				System.out.println(su+"�� Ȧ��");
				break;
			default: //if���� else if���� ������ else������ ����.(���� ���� ��� ���� X ���)
				System.out.println("�Է¹��� �� �ִ� ���� 0~10������");
				break;
		}
		System.out.println("switch ���� ����");
	}

}
