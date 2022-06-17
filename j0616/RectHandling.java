package j0616;
//Rect+RectHandling ��ģ ��
//���簢��(�߻�ȭ)=>�繰(��ü)->�����ϱ� ���� ���赵 ����(���簢��)
class Rect {
	 
	// 1.������ �������
	  private int x=10,y=20; //����(����),����(����)->x*y->���簢���� ����
	  private int area;
	  
	//�߰� (),(x),(y),(x,y)     //������=> ������� ������ ����!, �����ڴ� �տ� ��ȯ�� ���� ����.(int,void,,,�Ⱦ�)
	  Rect(){
		  this(90,100);//�ٸ� �����ڸ� ȣ���� �� �� ù��°�� ��� �ȴ�.(2)
		 /* this.x=20;//���� ������ ��ü          r.x=20
		  this.y=30;									  r.y=30
		  */
		  System.out.println("�⺻ ������(������� �ʱ�ȭ)");//(4)
	  }
	  //�����ε�-�ϳ��� Ŭ�������� ����� ����� ���� �޼ҵ� ���� �� ���� ����� �������� �ϳ��� �������ִ� ��
	  //��> �̸��� �ݵ�� ����, �Ű������� ������ �ٸ��ų�,�ڷ����� �޶�� �Ѵ�.
	  Rect(int x){//int x �� �ڷ��� �������ֱ�
		  if(x<0) {
			  System.out.println("������ ���� �Ұ�");
		  }else {
			  this.x=x;//r2.x=30;
			  //this.y=40; //r2.y=40;
			  System.out.println("1��¥�� ������ ȣ��(this.x)=>"+this.x);
		  }
	  }
	  Rect(double y){//�ڷ��� ��ȯ-int�� �ϸ� ������ //int->double(�ڵ� �� ��ȯ)//int<--(int)double(����� �� ��ȯ)
		  this.y=(int)y; //�ڵ����� �� ��ȯ ���� �ʱ� ������ ���������!
	  }
	  Rect(int x,int y){//x=90,y=100
		  this.x=x; //r.x=90
		  this.y=y; //r.y=100
		  System.out.println("2��¥�� ������ ȣ��");//(3)
	  }
	 //2. Setter(����), Getter Method(�ҷ��ͼ� ���) �ۼ� ->���� ������� �ٷ� �ؿ� ����.
	  //���� Setter, Getter ��� ��!
	  public void setX(int x) {//a�� ������ �� ���� �����Ƿ� if������ ����!
		  if(x<0) {
			  System.out.println("x���� ���� �Է� �Ұ�");
			  //x=10; //�ʱⰪ-> ������ �ʱⰪ �̹� �����ؼ� ���⼱ ���� ���ص� ��.
			  return;	  //Ż�⹮ ����(break ���)
		  }
		 this.x=x;//�������=�Ű����� x=20
	  }
	  //public void setXXXXXX(�Ű������ڷ��� ������){�������=�Ű�����;}
	  public void setY(int y) {//a�� ������ �� ���� �����Ƿ� if������ ����!
		  if(y<0) {
			  System.out.println("y���� ���� �Է� �Ұ�");
			  //x=10; //�ʱⰪ-> ������ �ʱⰪ �̹� �����ؼ� ���⼱ ���� ���ص� ��.
			  //return;	  //Ż�⹮ ����(break ���)
		  }else {//return �Ⱦ��� else ��� ��.
		  this.y=y;//�������=�Ű����� r2.y=40;
		  }
	  }	  
	  //public �ڷ�����ȯ�� getXXXXXX(){return ���������;}
	  public int getX() {return this.x;}
	  public int getY() {return this.y;}
	  //2. ������ ���(=�޼���)=>������ ���ϴ� �޼���
	  //1)�Ű�����X,��ȯ��X->�ܼ�,�ݺ�=>�Ȱ��� ������ �ݺ��ؼ� ���
	 void print(){
		 System.out.println("x�� ��=>"+this.x+",�̰� y���� "+this.y);
		 System.out.println("x*y=>"+(this.x*this.y)+"�Դϴ�.");
		 }
	 //2) �Ű����� O,��ȯ�� X -> �Է� O => ���,���,����
	 void area(int x,int y){
		 this.x=x;  // ->�������=�Ű�����x=20
		 this.y=y;
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
		//------RectŬ���� ��ü r2�����ϸ鼭 �μ� 1��¥�� ������������ ȣ��--------
		Rect r2=new Rect(30);//x
		r2.setY(40);
		r2.print();//1200
		
		Rect r3=new Rect(50,60);//x,y
		r3.print();//3000
		//------------------------------
		  Rect r=new Rect();//->Rect() 90,100  ȣ��
		 // 2.��ü��.�������=��;//���͸���
		 //r.x=10; r.y=20;
		  //r.setX(-20);//-20->10
		  //r.setY(30); //30*10=300
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
