package j0610hw;

public class StarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a(���� ��),b(���� ������ ������ ���� ����),����(c)
		for(int a=1;a<=5;a++) {
			for(int c=1;c<a;c++) {
				//������ ������Ű�鼭 ���
				//(ù�ุ ������ ������ְ� ������ ���� �ึ�� ���� ����)
				System.out.print(" ");
			}
			for(int b=5;b>=a;b--) {
				System.out.print("*"); 
			}
			System.out.println();
		}
			
	}

}
