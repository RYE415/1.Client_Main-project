package j0609;
//���� ������,���� ������(=����������)
public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����,���׿�����");
		//byte, short, int, long
		int a=5, b=7,x=10,y=-10;
		//���׿����� -> ���ǽĿ� ���� ������ ����� ���� �����ؼ� �����Ű�� ������
		//����) �ڷ��� ������=(���ǽ�)? ���ΰ�:�����ΰ�;
		int absX=(x>=0)?x:x; //���밪 10->10 -(-10)=10
		int absY=(y>=0)?y:-y; //abs:absolute���ڷ� �׳� ���� �̸����� �� ��!
		System.out.println("x=10�϶� x�� ���밪=>"+absX);
		System.out.println("y=-10�϶� y�� ���밪=>"+absY);
		/*
		 * int c=a+b 		a=a+1,a=a-1,a=a*1,a=a/1,a=a%1
		 * 						��> �ڱ� ������ ���� ����� �� �ڱ� ������ ����(����)
		 * 						a=a+1 -> a++	or  a+=1 (��κ� a++��, ª���ϱ�)
		 * 						a=a-1  -> a--		or  a-=1  (��κ� a--)
		 * 						a=a+2 -> a+=2				  (2�̻� ���ʹ� �̰ɷ�)
		 * 						a=a-2  -> a-=2
		 */
		a+=b;//a=a+b; //+=, -=, *=, /= (������ �ϳ� -> ����ӵ� �� ����)
		System.out.println("a=>"+a); //5+7=12
		
		a-=b; //a=a-b -> a=12-7
		System.out.println("a=>"+a); //5
		
		a*=b; //a=a*b -> a=5*7
		System.out.println("a=>"+a); //35
		
		a/=b; //a=a/b -> a=35/7
		System.out.println("a=>"+a); //5
		
		

	}

}
