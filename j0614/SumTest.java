package j0614;
/*
 * 2���� ���� �Է��� �޾Ƽ� ��Ģ����(+,-,*,/)�� ���ִ� ���α׷��� �ۼ�?
 */

public class SumTest {//���α׷�=>ȸ��
	//1.������ ���� ����(=�������) 2.�޼��� ȣ�� ����
	//��������� ������ ������ ���� ����X

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int a=100;
		int b=50;
		int c=50,d=30;
		
		//(1)�ܼ�,�ݺ����� ����
		/*
		System.out.println("(a+b)=>"+(a+b));
		System.out.println("(a-b)=>"+(a-b));
		System.out.println("(a*b)=>"+(a*b));
		System.out.println("(a/b)=>"+(a/b));
		*/
		//�޼��带 ȣ��->��ü�� ����->��ü��.ȣ���Ҹ޼���() or (~)
		SumTest st=new SumTest(); //��ü ���� -������ ���� or �� ��Ű���� ���⼭�� �� ��Ű�� ����.
		st.calculate(a, b); //100,50
		st.calculate(78, 90);//���뼺
		st.calculate(23, 45);
		st.calculate(12, 78);
		
		for(int i=1;i<=10;i++)
		st.calculate(90, 9);
	}
	
	//��������(Work Method)->�Ű����� O or X, ��ȯ�� X
	void calculate(int a,int b) {
		System.out.println("(a+b)=>"+(a+b));
		System.out.println("(a-b)=>"+(a-b));
		System.out.println("(a*b)=>"+(a*b));
		System.out.println("(a/b)=>"+(a/b));
		System.out.println("=============");
	}
	

}
