package j0615;
//�� ���� ���� �Է¹޾Ƽ� �ִ밪�� ���Ͻÿ�. <-> �ּҰ�
public class ThreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=4;
		int c=19;
		//�߰�
		/*
		int max;//�ִ밪
		//		12 > 4
		max=(a>b)?a:b; //max=12  => ���׿�����
		//			12 > 19
		max=(max>c)?max:c;
		System.out.println("max=>"+max);
		*/
		ThreeTest tt=new ThreeTest();
		tt.getMaxPrint(a,b,c);
		tt.getMaxPrint(23, 78, 83);
		tt.getMaxPrint(11, 34, 66);
		//��ȯ�� O
		int replymax=tt.getMaxPrint2(23,98,77);
		System.out.println("��ȯ���� �ִ밪�� "+replymax);
	}
	//��ȯ���� �ִ� �޼���->����
	int getMaxPrint2(int a,int b,int c) {//���������̱⿡ �Ѱܹ޾Ƽ�
		int max;//�ִ밪
		//		12 > 4
		max=(a>b)?a:b; //max=12  => ���׿�����
		//			12 > 19
		max=(max>c)?max:c;
		return max;//return ��� �����(����)
		//System.out.println("�ִ밪�� "+max+"�Դϴ�.");
	}
	
	//work method
	void getMaxPrint(int a,int b,int c) {//���������̱⿡ �Ѱܹ޾Ƽ�
		int max;//�ִ밪
		//		12 > 4
		max=(a>b)?a:b; //max=12  => ���׿�����
		//			12 > 19
		max=(max>c)?max:c;
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
	}
}
