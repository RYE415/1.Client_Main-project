package j0615;
//������ �����ε�+�޼��� �����ε�
//Ŭ������ �ۼ��ϴ� ����->��ü����->1.���������� 2.�޼���ȣ��
class Test2{
	void test() {
		System.out.println("�ٸ� Ŭ���� ��ü���� ����� �����ؿ�");
		
	}
}

public class PrintTest {
	
	//3)������ �����ε�->�޼���->�޼��带 ȣ���ϴ� ���	
	PrintTest(){} //�⺻ �����ڴ� ������ ���� �ڵ����� ȣ���Ѵ�.
	PrintTest(char a){
		//������ ���ο����� �ڱ� Ŭ������ ��ü���� ��� X
		//�ٸ� Ŭ������ ��ü���� ����� �� �ִ�.(O)
		print(a);//print('v');//(2)
		Test2 t2=new Test2();
		t2.test();
		System.out.println("char �Ű������� �޾Ƽ� ó����!!");//(4)
	}
	PrintTest(int a){
		print(a);//print(2022) //(6)(8)		
	}
	PrintTest(boolean a){
		print(a);//print(3<2);//(10)(12)
	}
	//���� �Է�->���
	//(2)�޼��� �����ε�
	void print(char a) {
		System.out.println("a=>"+a);//(3)
	}
	void print(int a) {
		System.out.println("a=>"+a);//(7)
	}
	void print(boolean a) {
		System.out.println("a=>"+a);//true//(11)
	}
	//(1)
	/*
	void charPrint(char a) {
		System.out.println("a=>"+a);
	}
	void intPrint(int a) {
		System.out.println("a=>"+a);
	}
	void booleanPrint(boolean a) {
		System.out.println("a=>"+a);
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)
		/*
		PrintTest pt=new PrintTest();
		pt.charPrint('v');
		pt.intPrint(2022);
		pt.booleanPrint(3>2);//true
		*/
		//(2)
		/*
		PrintTest pt=new PrintTest();
		pt.print('v');
		pt.print(2022);
		pt.print(3>2);//true
		*/
		//(3)������=>�ٸ� �޼��带 ȣ��
		//PrintTest pt ��ü�� �����ϸ鼭 �μ� 1��¥�� ���ڿ� ó�� ������ 
		PrintTest pt=new PrintTest('v');//(1)
		PrintTest pt2=new PrintTest(2022);//(5)
		PrintTest pt3=new PrintTest(3>2);//(9) boolean
	}

}
