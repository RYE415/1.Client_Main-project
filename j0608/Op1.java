package j0608;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���,����������");
		//int a=3,b=4;
		//int c=a+b;//byte c=a+b -> �⺻ ���� �ڷ����� int
		//System.out.println("c=>"+c);//7
		//���� ����=>r*r*3.141592 => int ���� X double������ ���� -> �Ҽ������� �����Ƿ� (r:radius ������)
		// +,-,*,/ : ��� ��� ���� int ������ ����� �ʴ� �� �⺻ �ڷ����� int
		double area=5*5*3.141592;
		System.out.println("area=>"+area);
		int a=4;
		int b=a++; // ++�� �ڿ� �پ����� a ���� ��� -> �������!
		/*
		 * int b=a;
		 * a=a+1 --> a+=1 (javascript)
		 */
		System.out.println("�߰� a=>"+a+",b=>"+b);
		int c=++a;
		/*
		 * a=a+1 -> a=5+1 ->6
		 * int c=a -> c=6
		 * //++�� �տ� �پ����Ƿ� a���� ��� -> ������ �Ʒ���, ���ʿ��� ���������� �д� �������!
		 */
		System.out.println("���� a=>"+a+",b=>"+b+",c=>"+c);
	}

}
