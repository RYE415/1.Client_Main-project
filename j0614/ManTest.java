package j0614;

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��ü ����=>Man�� ���� ������ ������ ������ ���� ���� ����.
		Man m=new Man();//Ŭ������ ��ü��=new Ŭ������();
		//j0614.Man@156643d4 => ��Ű����.Ŭ������@16����
		System.out.println("m=>"+m);//��ü�� ����=>�ּ� ����
		//2.��ü��.�������=��(����) <-> ��ü��.���������
		m.age=40;
		m.name="james";
		m.isMarried=true;
		m.child=3;
		//3.��ü��.ȣ���� �޼����() or (~)
		m.print();
	}

}
