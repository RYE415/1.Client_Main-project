package j0616;

import java.util.Scanner;//��� Ŭ���� �޸𸮿� �ø�(java.util.*)

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int su,su2,su3,su4,su5; -> ���� =>�迭�� ����϶�
		int jumsu[]=new int[5];//0~4
		int sum=0;//�հ�
		double avg=0.0;//���
		
		Scanner sc=new Scanner(System.in);//Ű����
		System.out.println("5������ ������ �Է��ϼ���?");//int
		/*5�� �ݺ��ؼ� ����=>for��
		jumsu[0]=sc.nextInt();
		sum+=jumsu[0];//sum=sum[0]+jumsu[0](78)
		
		jumsu[1]=sc.nextInt();
		sum+=jumsu[1];//sum=78+34
		*/
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i]=sc.nextInt();
			sum+=jumsu[i];
		}//for
		//���� �հ�,���
		avg=(double)sum/jumsu.length;//5����
		System.out.println("�հ�=>"+sum+",���=>"+avg);
	}

}
