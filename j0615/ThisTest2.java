package j0615;
//2.this=>���� ������ ��ü�� ����Ű�� �����(=Ű����)�� ���
public class ThisTest2 {
	
	
	
	ThisTest2(){
		System.out.println("���� ������ ��ü�̸�(������ ����)"+this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest2 aa=new ThisTest2();//��������� ��ü��:aa
		System.out.println("���� ������ ��ü��(aa)=>"+aa);
		System.out.println("===================");
		ThisTest2 aa2=new ThisTest2();
		System.out.println("���� ������ ��ü��(aa2)=>"+aa2);
	}

}
