package j0616;

public class ArrayTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		//int su,su2,su3;
		//����)�ڷ��� �迭��[]=new �ڷ���[����]
		//�ʱⰪ �ڵ� ����=> int -> 0, double->0.0, boolean ->false �ڵ����� �ʱ�ȭ
		int su[]=new int[3];//0,1,2 =>�迭 ����
		System.out.println("su=>"+su); //�ּҰ� ������-��ü =>�迭�� ��ü-�ּҰ� ����
		su[0]=10;su[1]=20;su[2]=30; //->su�� 0��° ��ҿ� 10, 1��° ��ҿ� 20,,,
		System.out.println("su[1]=>"+su[1]);
		System.out.println("su[2]=>"+su[2]);
		int su4=23; //���������� �ݵ�� ����->���� ������Ѿ� �Ѵ�.
		System.out.println(su4);
		//����2)�ڷ��� �迭��[]={��1,��2,��3,��4};//����,�ʱ�ȭ ���ÿ�
		int c[]= {10,20,30,40,50,60,70,80,90,100,110,120,130};
		/*
		 * int c[]=new int[13];
		 * c[0]=10;c[1]=20;,,,,,;c[12]=130; -> ���� ������ �����! �׷� �� ����2) ���
		 * 
		 * �迭��.length=>�迭�� ���̸� �ڵ����� ����� �ִ� ���� ����.
		 * �迭�� for�� ���� ����: �迭�� �ε����� �̿��ؼ� �پ��� ���� ��½�ų �� �ִ�(����)
		 * (����) �迭
		 */
		for(int i=3;i<c.length-1;i++)
			System.out.println("c["+i+"]="+c[i]);
		//Ȯ�� for��(=���� for��)=>�ܼ��� �迭,��ü�� ���� �����ͼ� ���
		//����) for(�迭�� �ڷ��� ����� ������:��´����(�迭 or �÷��� ��ü)
		for(int num:c)//÷�ڰ���ϰ�� ������� ���� �迭�� ���� Ȯ��
			System.out.print("num="+num+"\t"	);
	}

}
