package j0615;
//1.�޼���(=������)�� �ۼ��� �� ��������� �Ű������� ���� ������ ��� ����?
//this.�������=�Ű�����
public class ThisTest {
	
	private int a=100;//200->400
	
	ThisTest(int a){//�������=�Ű�����-> ������� �տ� this.�ۼ�!
		this.a=a;//�������=�Ű����� a=200
	}
	public void setA(int a) {
		this.a=a;//this.a=400
	}
	public int getA() {return a;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt=new ThisTest(200);//100->200
		tt.setA(400);
		System.out.println("tt.getA()=>"+tt.getA());
	}

}
