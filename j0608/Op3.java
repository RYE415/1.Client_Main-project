package j0608;
/*
 *  ����(=��Һ񱳿�����) >,>=, <, <=, !=(�����ʴ�.), ==(��ǻ�� ��� 2��)
 *  �������� -> ��, ������ �Ǻ��� �� �ִ� ������(boolean) &&,||,^
 */

public class Op3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����,��������");//���=>���ǽ�
		int t1=3, t2=5, t3=7;
		int t4;
		boolean b1,b2,b3; //������ ����Ǿ� ������ ���� ���� ���� X
		boolean b4=true;
		//(3>5)
		System.out.println("(t1>t2)=>"+(t1>t2)); //false
		//(5<7)
		System.out.println("(t2<t3)=>"+(t2<t3)); //true
		//����,�� ������ ȥ��
		b1=(t1>t2) && (t2<t3); //(3>5) && (5<7) ������
		System.out.println("(t1>t2) && (t2<t3)=>"+b1); //false
		
		// ||
		b2=(t1>t2) || (t2<t3); //(3>5) || (5<7) ������
		System.out.println("(t1>t2) || (t2<t3)=>"+b2); //true
		
		b3=!b4; // ���� �տ� !(=NOT) 
		System.out.println("!b4=>"+b3); //false
		
		// |
		b2=(t1>t2) | (t2<t3); //(3>5) | (5<7) �����(�Ѵ�üũ)
		System.out.println("(t1>t2) | (t2<t3)=>"+b2);  //true
		
		// ^
		b3=(t1>t2) ^ (t2<t3); //^ T,T ,F F ->(���� ���� ������ ����)
										  //T F, F T -> ���� ���� �ٸ��� ��
		System.out.println("(t1>t2) ^ (t2<t3)=>"+b3); //true
		

	}

}
