package j0614;

//������ �ڷ���X => ���ο� �ڷ����� �ҷ��ͼ� ������ ����, ����, ��ȸ, ����
public class CarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��ü ���� -> ��ü(������ �����)�� ������ �� �ִ� ������ ������.
		//����) ���赵 �̸�(=Ŭ���� �̸�) ��ü��(=����)=new Ŭ������()
		int age; //4byte ��� ������ ���� O
		//Car morning; //��ü ����->��� ������ ����X (����� ����)
		Car morning=new Car();
		Car sonata=new Car();
		//morning ������ ������ ���� �ϳ� �����϶�. 4byte ��� ���� ����. 4byte=int(����)�� ����.
		//��ü->�ּҰ� ��Ű����.Ŭ������@�ּ�
		System.out.println("morning=>"+morning);
		System.out.println("sonata=>"+sonata);
		
		//2.��ü��(����� ��ġ).���������=��(����)=>����
		/*(1) �� ������δ� ���͸����� �ùٸ� ���� �����ؼ� ������ ���� ����.
		morning.name="���";
		morning.output=-1000; -> ��ⷮ�� ������ �� ����.
		morning.color="blue";
		morning.year=2022;
		
		sonata.name="�ҳ�Ÿ";
		*/
		//(2)Setter Method�� ���ؼ� ���� ����
		morning.setName("���");
		morning.setOutput(-1000);
		morning.setColor("blue");
		morning.setYear(2019);
		
		sonata.setName("�ҳ�Ÿ");
		
		//3.����->�õ��ɱ�->�޼��� ȣ��=��� �۵�(�������� ��ư Ŭ��)
		//��ü��.�޼����() or (~,,,,)
		morning.startEnginee();
		morning.SpeedUp(150000);//speedUp�޼��带 ȣ���ϸ鼭 150�̶�� �Ű����� ���� �����Ѵ�.
		morning.SpeedDown(30);//150-30=120���� �޸��� ��
		
		System.out.println("���� �̸���=>"+morning.getName());
		System.out.println("���� ��ⷮ=>"+morning.getOutput());
//		//���� ���ǰ� �ݺ����� �ڵ�->�޼��带 ���� ȣ���ϴ� �� �� ����.
//		//=>�ڵ��� ���뼺,�ڵ����� �پ���.(���� �ð��� ����)=>���α׷��� ������
		morning.carInfoPrint();
		sonata.carInfoPrint();
		
		
	}

}
