package j0609;

public class Op5Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڵ�����ȯ");
		//1. ���� �����Ͱ� -> ū ������ ���� -> �ڷ����� ũ�⿡ ���缭 ����ȯ O
		//�ڵ����� �ٲ�
		//����Ǵ� ���� ������ ������ �޸� ���� �߻��Ѵ�.
		//byte s=12; //     00001100 ->8421 ��ȣ��Ʈ 0(���) 1(����)
		short s=12; //   00000000 00001100
		int n=s; //        00000000 00000000 00000000 00001100
		
		//2.��� �߰��� �ڷ����� ��ȯ -> ���� �����Ͱ� ū �����ͷ� ��ȯ
		//�ڵ����� �ȹٲ�� ������ ������ �ٲ�� ��! -> (...)�����ν� ->ex: (char)
		char c='A'; //65
		int n2=c+1; //char(2byte)+int(4byte)=��+��=��+��(int)+int
		System.out.println("n2=>"+n2);//66
		System.out.println("(char)n2=>"+(char)n2);//int=>char
		//������� �� ��ȯ -> ����(������ �ս� O)
		int su=(int)3.5; //double(8byte)
		System.out.println("su=>"+su);//3����, 0.5����X->�ս� ->0.5©���� ��!
		
		int x=123;
		float y=x+12.3f; //int+float -> float+float=float=>123.0f+12.3f
		//float�� �ٲٴ� ����:12.3�̿��� double�� ��������. 12.3f�̱� ������ float
		// ���� �����ʹ� ū ������ ���󰡰� �Ǿ�����.
		System.out.println("y=>"+y);
		System.out.println("���� ����ȯ ������ ��");
		byte s2=12; short s3=45;
		int re=s2+s3; //byte+short=short+short=short(X)
		//�ڹ��� �⺻ ���� �ڷ���
		System.out.println("re=>"+re); //57
		short re2=(short)(s2+s3); //int -> short(������� �� ��ȯ)
		//������ �ƴ� ���İ��� �� ��ȯ �� ���� ������ ( )�� ������� �Ѵ�.
		System.out.println("re2=>"+re2);//57
	}

}
