package j0609;
//����ȯ2+printf() �޼���
public class Op6cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=30;
		//printf(��¾��,,,����� �����)
		//decimal:10����   char       String        float
		//->%d(������),  %c(����),%s(���ڿ�),%f(�Ҽ���)
		System.out.printf("ù��° ����=%d",num1); //ù��° ����=20
		System.out.println();//����� ��X => �ٹٲ޸� �Ͼ. ln:�ٹٲ�
		System.out.print('\n'); //Ư����ȣ�� �°� ����-> \n :�ٹٲ�
		System.out.printf
		("ù��° ����=%d,�ι�°����=%d",num1,num2);
		//�� ��ȯ ���ܻ���
		char ch='A'; //65 =>char->int
		//byte,short,int,long(���� ����) : -128~127 ->�ڵ�����ȯ ��������
		//char(0~65535 ����� ����)->int(4byte)���� �ڵ�����ȯ ��������
		System.out.println();
		System.out.printf("���� %c�� �����ڵ尪�� %d\n",ch,(int)ch);
		//��> �ٹٲ� ���� �Ⱦ��� ��ü������ �������� \n �Ἥ �ٹٲ� �ֱ�!
		//��>���� ���ǲ� �ڵ�����ȯ �Ͼ�� �ϴµ� 
		//printformat �ȿ����� �ڵ�����ȯ�� ���Ͼ�� ������ ���� ����ȯ �ؾ� ��.
		//char�� ����� �ִµ� ������ ������ int�� �ڵ�����ȯ�ϴ� �� ������� �ִ�. printf�ȿ�����!
		int ch2=ch; //char->int
		System.out.println("ch=>"+ch2);
		//���չ���->����
		//����->1.����� �� 2.����� ���α׷� �ۼ� �� 3.���� ���α׷��� ���� ����
		int java=90,jsp=85,oracle=90;
		int sum=java+jsp+oracle;
		System.out.printf("sum=%d�Դϴ�.\n",sum);
		//���
		int avg=sum/3; //int ������ �����ϹǷ� �Ҽ��� �߸�. => double��!
		double avg2=sum/3; //88.0 ->sum��ü�� int�̹Ƿ� �Ҽ��� �߸�->double�� ����ȯ ���ױ� ������ ���� .0 �ٴ� ��!
		double avg3=(double)sum/3;
		//    / �Ŀ� �տ� (double)������ �� ��
		//(double)(sum/3): ���Ŀ� ()�� ��� �ϳ��� ���� �̹� ������ ���� ���� sum/3�� double�� �� ��ȯ�ϴ� ���̱� ������ �ǹ̰� ����.=88.0
		//(double)sum/3: ������ sum�� double�� �� ��ȯ �� /3 �ϱ�! -> ���� �� ����!=88.3333333333
		System.out.println("avg=>"+avg+",avg2=>"+avg2);
		System.out.println("avg3=>"+avg3);
		
		//����)-> %f ->%��ü�ڸ���.�Ҽ����ڸ���f => %.2f(�Ҽ��� ��°�ڸ�����)
		System.out.printf("���(avg3):%5.2f\n",avg3);
		//88.33=> �Ҽ������� 5�ڸ� ��!
		// ���� ��Ȯ�� �𸥴ٸ� ��ü�ڸ� �� ���� �� ���� ��! 
		//=System.out.printf("���(avg3):%.2f",avg3);
		//��ü�ڸ����� ���� ����, ���� ��쿡 ��� X ���� �������� ä����!
		System.out.println("abc\t123\b456");
		// \t : ��Ű��ŭ �Ÿ��� �ֶ� \b:backspace -> �齺���̽��� ���� �Ⱥ���-> �׸�� �����ִ� ��
		System.out.println("\"HelloTest\""); //���ڿ� �յڿ� " " ǥ��
	}

}
