package j0614;
//�߻�ȭ=>���ο� ������ �����(�ڵ���,�л�,�ǹ�,,,)�� ������ �������� �������
//				���赵
public class Car {//Ŭ������(=���ο� �ڷ����� �̸�), int, byte,,,
	
	//Car(��ü-����� �����)=> �⺻������ ������ �ִ� Ư¡,Ư��(=8���� �ڷ���-already known),+������(=���)
	//1. �������=>Ŭ���� ���ο� ����� ����->�ڵ����� �ʱⰪ �����ȴ�.
	private String name; //����̸�-������ ������ ������ �� �ִ� �ɷ� ����!
	private int output; //��ⷮ
	private int year=0; //����
	private String color; //���� ���� => null(���� ���� ����) -> String�� �� ���ָ� null, int�� 0��!
	//���� ����
	private int current_speed; //���� �ӵ�
	//int sidong=0; //�õ� ����, 0=�õ�x, 1=�õ�O
	private boolean sidong=false; //���� �õ�����
	
	//2.Setter Method
	public void setName(String n) {
		if(n!=null)//���� �Է��ߴٸ�
		name=n; //���������="���"
		else
			System.out.println("name���� �ݵ�� �����ؾ� �մϴ�.");
	}
	//�ܺηκ��� ���� �Է�->����->���͸���->����X
	//����X, ����� ������� ������ ���
	public void setOutput(int ou) {
		if(ou<0 || ou>5000) {//-1000
			System.out.println("�Է� ���� ���� ������ �Է��ϰų� 5000�̻� ���� �Ұ�");
			output=1000;
			return; //break
		}
		output=ou;//output=-1000;
	}
	public void setYear(int y) {
		if(y<0 || y>2022) {
			System.out.println("�⵵�� �����̰ų� 2022 ���غ��� Ŭ �� ����");
			year=2022;//default
		}else {
		year=y;
	}
	}
	public void setColor(String c) {
		color=c;
	}
	public void setCurrent_speed(int cu) {
		current_speed=cu;
	}
	public void setSidong(boolean si) {
		sidong=si;
	}
	public String getName() {return name;}
	public int getOutput() {return output;}
	public int getYear() {return year;}
	public String getColor() {return color;}
	public int getCurrent_speed() {return current_speed;}
	public boolean getSidong() {return sidong;}
	
	

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
	//�����̰ų� / ���->170km �̻� �ӵ� ���� X
	void SpeedUp (int speed) {
		//�õ��� �ɸ� ���¶��
		if(sidong) {//if(sidong==true) {boolean������ ���
		if((speed < 0) || (current_speed+speed>=170)) {
			System.out.println("�ӵ��� �����̰ų� 170km �̻��� �Ұ���");
			current_speed=120;//�⺻��
		}else {//>170�̰ų� ������ �ƴ� ���
			current_speed+=speed;//current_speed=current_speed+speed;
			System.out.println(speed+"km��ŭ �ӵ� ������");
		}
		}else {//�õ��� �Ȱɸ� ����
			System.out.println("���� �õ��� �ɾ�� �ӵ��� ������ų �� ����");
		}
	}
	
	
	//	4) �ӵ��� ����(�����̰ų� ���(current_speed-speed<=0))
	void SpeedDown(int speed) { //���� ����. Ʋ�� ���� �����Ƿ� �ٽ� �ڼ��� ����.
		if((speed < 170) || (current_speed-speed>=0)) {
			System.out.println("�ӵ��� �����̰ų� 170km �̻��� �Ұ���");
			current_speed=120;//�⺻��
		}else {//>170�̰ų� ������ �ƴ� ���
			current_speed-=speed;//current_speed=current_speed-speed;
			System.out.println(speed+"km��ŭ �ӵ� ���ҵ�");
		}
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
