package j0610;

public class StarTest2 {
// �� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a(���� ��), b(���� ������ ������ ���� ����)
		for(int a=1;a<=5;a++) {
			//System.out.print("*"); ���� �����Կ� ���� *�� �����ؾ� ��!-> ���⼭ ���� ����a!
			for(int b=1;b<=a;b++) { //b�� *�� ���ϴ� ��!
				System.out.print("*"); 
			}//inner for
			System.out.println();//�ٹٲ�
		}//outer for
			
	}//main

}
