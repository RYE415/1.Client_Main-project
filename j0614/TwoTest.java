package j0614;
/*
 * 1.����ڷκ��� ���� �Է¹޾Ƽ� (2��) ū ���� ���Ͻÿ�. <-> ���� ���� ���Ͻÿ�.
 * 2.�ִ밪�� �����ִ� �޼���(max)�� �̿��ؼ� �ִ밪�� ���Ͻÿ�.
 * 3.�ּҰ��� �����ִ� �޼���(min)�� �̿��ؼ� �ּҰ��� ���Ͻÿ�.
 */
public class TwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=12;
		int y=67;

		/*(1) ��ȿ������ �ڵ����(�ܼ�.�ݺ����� ����)
		if(x>y)//67>12
			System.out.println("ū����"+x+"�Դϴ�.");
		else
			System.out.println("ū ����"+y+"�Դϴ�.");
		
		int a=56;
		int b=97;
		
		if(a>b)
			System.out.println("ū����"+a+"�Դϴ�.");
		else
			System.out.println("ū ����"+b+"�Դϴ�.");
			*/
		TwoTest tt=new TwoTest();
		tt.max(x, y);
		tt.max(32, 12);
		tt.max(34, 99);
		System.out.println("==========");
		//tt.min(90,23)->23
		tt.min(90,23);
		tt.min(34, 14);
	}
	
	//�ִ밪(max)
	void max(int x,int y) {
		if(x>y)//67>12
			System.out.println("ū����"+x+"�Դϴ�.");
		else
			System.out.println("ū ����"+y+"�Դϴ�.");
	}
	//�ּҰ�(min)
	void min(int x,int y) {
		if(x>y)
			System.out.println("���� ����"+y+"�Դϴ�.");
		else
			System.out.println("���� ����"+x+"�Դϴ�.");
	}

}
