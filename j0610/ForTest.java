package j0610;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.for���� ����(C++)");//�ʱ���� for ����
		//for(�ʱ��;���ǽ�;������)
		for(int i=1;i<=5;i++) {//���ǽĿ� ���� ������ ������ �� ���� �̻�
			System.out.println("�ݺ��� for�� ����"+i);
		}
		System.out.println("================");
		System.out.println("2.for���� ����2(C�������)");
		/*int k;//�ʱ���� ������ for�� �ۿ� ���� -> C���
		//      1)     2)   5)
		for(k=10;k>5;k--) //4)
			System.out.println(k+"�׽�Ʈ");//3)6)
	*/
		System.out.println("3.for���� ����3");
		int k=10;
		for(;k>5;k--)
			System.out.println(k+"�׽�Ʈ");
		
		System.out.println("4.�ּ����� for�� ����(�����ĵ� ��������)");
		int c=1; //�ʱ���� for�� �ۿ� ������ ����
		c++; //2 �������� for�� �ۿ� ������ �� ����.
		for(;c<=20;) {
			System.out.println("20�� �ݺ�"+c);
			c++;
		}//for���� �������� ������ ���������� for�� ���ο� �ۼ� O
		//�� ó���� ���ϸ� �ٷ� �� �ؿ� ���常 ������. �׷��Ƿ� ������� ��!
		System.out.println("5.for���� ���� ���� ����");
		//while(true)//for(;;) -> �Ѵ� ���ѷ���
			//System.out.println("���ѷ���");
		System.out.println("5.�հ�,���� ���ÿ� ���ϱ�");
		//1~100������ ���� ���ϱ� -> 1+2+3+4+,,,+100=5050
		//����? �?
		int sum=0; //1+2+...100
		int gap=1; //����-> 0(X) -> �ʱⰪ 0�� �ָ� �� 0�� ��! �׷��Ƿ� 1���� ����
		
		for(int i=1;i<=5;i++) { //1~5������ ����,����
			sum+=i;//sum=sum+i
			gap*=i;//gap=gap*i ������ �׳� gap�̶�� ���� ������ ����.gop
			System.out.println("�߰��հ�(sum)=>"+sum);
			System.out.println("�߰���(gap)=>"+gap);
			System.out.println("==================");
		}
		System.out.println("�����հ�(sum)=>"+sum);
		System.out.println("������(gap)=>"+gap);
		//1~100������ �� => ¦���� ��(2,4,6,8,10~), Ȧ���� ��
		int total=0;
		for(int i=1;i<=100;i+=2) {//�������� �̿�
			//¦���� ���� �հ踦 ���϶�
			//if(i%2==0)   //Ȧ���� ���� i%2==1
				total+=i;
		}
		System.out.println("total=>"+total);
	}

}
