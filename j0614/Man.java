package j0614;
//�߻�ȭ=>��ü(�����ϰ� ���� �����)=>����Ư��(�������)+���(�޼���)
//-->Ŭ������ ������ ����(=�߻�ȭ(���ο� �ڷ����� ����� ��))
public class Man {

	//1.�������
	String name="scott"; //�ʱⰪ(scott)->james �� ���� ����
	int age;//40
	boolean isMarried=false;
	int child;
	
	//2.�������� ���=>�ܼ�,�ݺ�=>�Ű�����X, ��ȯ��X
	void print() {
		System.out.println("�� ����� ���̴� "+age+"���Դϴ�.");
		System.out.println("�� ����� �̸��� "+name+"�Դϴ�.");
		System.out.println("�� ����� ��ȥ������ "+isMarried+"�Դϴ�.");
		System.out.println("�� ����� �ڳ� ���� "+child+"���Դϴ�.");
	}
}
