package j0614;

//���簢��
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect nemo=new Rect();
		nemo.width=30.25;
		nemo.height=40.32;
		
		nemo.area();
		
		
		/*����� �ؼ�
		 * 
		 * 1.��ü ����=>���� ����
		 * Rect r=new Rect();
		 * 2.��ü��.�������=��;
		 * r.x=10; r.y=20;
		 * 3.��ü��.�޼����() or (~)
		 * r.print();
		 * 4.�޼��带 ȣ���ؼ� ���� ����
		 * r.area(20,40);  //x=20,y=40
		 * 5.��ȯ���� �ִ� �޼��� ȣ��
		 *=> ����) ��ȯ�޴� ������=��ü��.ȣ���� �޼����(~)
		 *		// r.area2(60,80);   //2400 -> ��� �ȵ� -> ��ȯ��(return)�� �ִ� ��� ��� ����� ���� ����.
		 * int reply=r.area2(60,40);   => �̷��� ȣ���ؾ� ��.
		 * System.out.println("������ �����(reply)=>"+reply);
		 *  ��ó�� ��ȯ�޾Ƽ� ����ϰų� �Ʒ�ó�� ���� ����ϰų�! ����� ����.
		 * System.out.println("r.area2(30,40)=>"+r.area2(30,40)); =>�̷��� �ѹ��� ����ص� ��.
		 */
		
	}

}
