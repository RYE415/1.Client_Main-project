package j0614;

class CoffeeMaker{
	String name;
	String brand;
	String color;
	int capsuleno;
	boolean power=false;
	
	//1. ���� on
	void turnOn() {
		power=!power;
		System.out.println("�ε���..Machine On");
	}
	//2. ���� off
	void turnOff() {
		power=!power;
		System.out.println("Machine Off");
	}
	//3. ĸ�� �޴�
	void MenuNo(String capsule) {
		if(capsule.equals("americano")) {
			capsuleno=1;
		}else if(capsule.contentEquals("latte")) {
			capsuleno=2;
		}
		System.out.println("���� �޴���"+capsule+"�Դϴ�");
	}
	//4. ��� ����
	void allabout() {
		System.out.println("==Coffee Machine==");
		System.out.println("�𵨸�:"+name);
		System.out.println("�귣��:"+brand);
		System.out.println("����:"+color);
		System.out.println("���� �޴���"+capsuleno+"���Դϴ�.");
		System.out.println("���� ����:"+power);
		
	}
}

public class CoffeeMakerHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMaker Dolce=new CoffeeMaker();
		//��ü��
		Dolce.name="��ü������";
		Dolce.brand="�׽�������";
		Dolce.color="ȭ��Ʈ";
		
		Dolce.turnOn();
		Dolce.MenuNo("americano");
		Dolce.allabout();
		Dolce.turnOff();
		
		
		
	}

}
