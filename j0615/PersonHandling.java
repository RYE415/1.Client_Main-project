package j0615;
//����Ʈ.���� �����ϴ� ������� ������ ����(�߻�ȭ,ĸ��ȭ,������ �����ε�+this)

class Person{
	//1.�������
	String name;
	int age;
	//String addr; ->�ּ�
	//(),(name),(age),(name,age)
	//(),(name),(age),(addr),(name,age),(age,addr),(name,addr),(name,age,addr)
	
	//2.������=>��������� ���� �����Ű�� ����(�ʱ�ȭ)
	Person(){//�ڱ� �޼ҵ� ���� �ڱ� ��ü ���������� ��� ����.this ���!
		this.name="ȫ�浿"; //p1.name="ȫ�浿";
		this.age=23;//p1.age=23;
		System.out.println("�� PersonŬ������ �⺻ �������Դϴ�.");
	}//�⺻ ������
	Person(String name){//Person p2=new Person("�׽�Ʈ");
		this.name=name;//name="�׽�Ʈ";
		this.age=24;       //p2.age=24; this�� ������ ��ü �ǹ�->�ؿ��� ��ü �̸� ��� ���� �� �𸣱� ������ ������ �ǹ̸� ���� this�� ��Ī.
		System.out.println("�� �Ű����� 1��¥�� ���ڿ�ó�������� ȣ���");
	}
	Person(int age){
		this.age=age;
		this.name="�׽�Ʈ��";
		System.out.println("�� �Ű����� 1��¥�� ������ó�������� ȣ���");
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("�� �Ű����� 2��¥�� ������ ȣ���");
	}
	
	//3. Setter Method  //public void set�빮��ù����~ : �׳� �ܿ��!
	public void setName(String name) {//p2.setName("�达")
		this.name=name; //p2.name="�达";
		
	}
	public void setAge(int age) {//p1.setAge(24)
		if(age<0) {
			System.out.println("���̴� ���� �Է� �Ұ�");
			this.age=23; //p1.age=23; �� ���� age=>�������
			return;
		}
		this.age=age; //���
	}
	//Getter Method
	public String getName() {return this.name;}//p1.getName
	public int getAge() {return this.age;}
	//�ܼ�,�ݺ�
	void print() {//p1.print() ȣ��
		System.out.println("�̸�=>"+this.name);
		System.out.println("����=>"+this.age);
		System.out.println("============");
	}
}
public class PersonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ������ ��ü��=new ������();=>��ü�� �����ϸ鼭 �⺻ ������ ȣ��
		Person p1=new Person();
		System.out.println("p1=>"+p1); //p1=>j0615.Person@156643d4
		//p1.setName("ȫ�浿");
		p1.setAge(24);//��������
		p1.print();
		//PersonŬ������ p2��ü �����ϸ鼭
		Person p2=new Person("�׽�Ʈ");
		p2.print();
		//p3��ü �����ϸ鼭 �μ� 2��¥�� �����ڸ� ȣ���϶�
		Person p3=new Person("�ӽ�3",38);
		p3.print();
	}

}
