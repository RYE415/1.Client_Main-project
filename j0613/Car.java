package j0613;
//�߻�ȭ=>���ο� ������ �����(�ڵ���,�л�,�ǹ�,,,)�� ������ �������� �������
//				���赵
public class Car {//Ŭ������(=���ο� �ڷ����� �̸�), int, byte,,,
	
	//Car(��ü-����� �����)=> �⺻������ ������ �ִ� Ư¡,Ư��(=8���� �ڷ���-already known),+������(=���)
	//1. �������=>Ŭ���� ���ο� ����� ����->�ڵ����� �ʱⰪ �����ȴ�.
	String name; //����̸�-������ ������ ������ �� �ִ� �ɷ� ����!
	int output; //��ⷮ
	int year=0; //����
	String color; //���� ���� => null(���� ���� ����) -> String�� �� ���ָ� null, int�� 0��!
	//���� ����
	int current_speed; //���� �ӵ�
	//int sidong=0; //�õ� ����, 0=�õ�x, 1=�õ�O
	boolean sidong=false; //���� �õ�����

	//2.���� ���(=������) => �޼��� ����(=�Լ�)
	//	1) �õ��ɱ�(�ܼ�,�ݺ�)
	void startEnginee() {//�⺻���->��������� ����,���
		sidong=true;//��������� ���� ����
		System.out.println("�õ��� �ɸ�!!!");
	}
	
	//	2) ���� ���� ���(�õ� off)(�ܼ�,�ݺ�)
	void stop() {//function stop(){}->in javascript
		sidong=false;
		current_speed=0; //���� �ӵ� 0
		System.out.println("���������� ���� �Ϸ�");
	}
	
	//	3) �ӵ��� ����=> �Է�O->��� ����->�Ű����� O,��ȯ��X
	void SpeedUp (int speed) {
		current_speed+=speed;//current_speed=current_speed+speed;
		System.out.println(speed+"km��ŭ �ӵ� ������");
	}
	
	//	4) �ӵ��� ����
	void SpeedDown(int speed) {
		current_speed-=speed; //current_speed=current_speed-speed;
		System.out.println(speed+"km��ŭ �ӵ� ���ҵ�");
	}
	
	// 5) ���� ���� ���(�ܼ�,�ݺ�)
	void carInfoPrint() {
		System.out.println("===���� ����===");
		System.out.println("���� �̸�=>"+name);
		System.out.println("���� ��ⷮ=>"+output);
		System.out.println("���� ����=>"+year);
		System.out.println("���� ����=>"+color);
		System.out.println("���� �ӵ�=>"+current_speed);
		System.out.println("���� �õ� ����=>"+sidong);
	}
}
