package j0615;
//Rect+RectHandling ��ģ ��
//���簢��(�߻�ȭ)=>�繰(��ü)->�����ϱ� ���� ���赵 ����(���簢��)
class Rect {
	 
	// 1.������ �������
	  private int x=10,y=20; //����(����),����(����)->x*y->���簢���� ����
	  private int area;
	  
	 //2. Setter(����), Getter Method(�ҷ��ͼ� ���) �ۼ� ->���� ������� �ٷ� �ؿ� ����.
	  //���� Setter, Getter ��� ��!
	  public void setX(int a) {//a�� ������ �� ���� �����Ƿ� if������ ����!
		  if(a<0) {
			  System.out.println("x���� ���� �Է� �Ұ�");
			  //x=10; //�ʱⰪ-> ������ �ʱⰪ �̹� �����ؼ� ���⼱ ���� ���ص� ��.
			  return;	  //Ż�⹮ ����(break ���)
		  }
		  x=a;//�������=�Ű����� x=20
	  }
	  //public void setXXXXXX(�Ű������ڷ��� ������){�������=�Ű�����;}
	  public void setY(int b) {//a�� ������ �� ���� �����Ƿ� if������ ����!
		  if(b<0) {
			  System.out.println("y���� ���� �Է� �Ұ�");
			  //x=10; //�ʱⰪ-> ������ �ʱⰪ �̹� �����ؼ� ���⼱ ���� ���ص� ��.
			  //return;	  //Ż�⹮ ����(break ���)
		  }else {//return �Ⱦ��� else ��� ��.
		  y=b;//�������=�Ű����� x=20
		  }
	  }	  
	  //public �ڷ�����ȯ�� getXXXXXX(){return ���������;}
	  public int getX() {return x;}
	  public int getY() {return y;}
	  //2. ������ ���(=�޼���)=>������ ���ϴ� �޼���
	  //1)�Ű�����X,��ȯ��X->�ܼ�,�ݺ�=>�Ȱ��� ������ �ݺ��ؼ� ���
	 void print(){
		 System.out.println("x�� ��=>"+x+",�̰� y���� "+y);
		 System.out.println("x*y=>"+(x*y)+"�Դϴ�.");
		 }
	 //2) �Ű����� O,��ȯ�� X -> �Է� O => ���,���,����
	 void area(int a,int b){
		 x=a;  // ->�������=�Ű�����x=20
		 y=b;
		 System.out.println("x*y=>"+(x*y)+"�Դϴ�.");
	 }
	 //3) �Ű�����O,��ȯ��O -> ��� ����, �����α׷��ֿ��� ���� Ȱ��
	 int area2(int a,int b){
	 		int result=a*b;
	 		return result; // => ����) return ����� ��(����)  or ���� or ��ü
	 							//				return�� ������ ����, return=>��ȯ��
	 					//System.out.println("result=>"+result)=> return �ڿ� �̷� �� ������ �ȵ�!
	 }
	}

public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //1.��ü ����=>���� ����
		  Rect r=new Rect();
		 // 2.��ü��.�������=��;//���͸���
		 //r.x=10; r.y=20;
		  r.setX(-20);//-20->10
		  r.setY(30); //30*10=300
		  //3.��ü��.�޼����() or (~)
		  r.print();
		  //4.�޼��带 ȣ���ؼ� ���� ����
		  r.area(20,40);  //x=20,y=40
		  //5.��ȯ���� �ִ� �޼��� ȣ��
		// => ����) ��ȯ�޴� ������=��ü��.ȣ���� �޼����(~)
		 		// r.area2(60,80);   //2400 -> ��� �ȵ� -> ��ȯ��(return)�� �ִ� ��� ��� ����� ���� ����.
		  int reply=r.area2(60,40);  // => �̷��� ȣ���ؾ� ��.
		  System.out.println("������ �����(reply)=>"+reply);
		  // ��ó�� ��ȯ�޾Ƽ� ����ϰų� �Ʒ�ó�� ���� ����ϰų�! ����� ����.
		  System.out.println("r.area2(30,40)=>"+r.area2(30,40));// =>�̷��� �ѹ��� ����ص� ��.
	
	}

}
