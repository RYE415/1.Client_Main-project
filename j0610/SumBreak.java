package j0610;
/*
 * <����1> 1���� 100������ ���� ���Ͻÿ�. -> step1
 * <����2> 1���� 100������ �� �߿��� 3�� ��� �Ǵ� 5�� ����� ���� ���Ͻÿ�. ->step2
 * 										i%2==0(2�� ���), 3�� ���:i%3==0, 5�� ���: i%5==0
 * <����3> 
 * 1���� 100������ �� �߿��� 3�� ��� �Ǵ� 5�� ����� ���� ���� �� �߿���
 * �հ谡 200�� �Ѿ�� �ּ��� ���� ���Ͻÿ�.(�κ� ����) -> step3
 */

public class SumBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0 || i%5==0)/*step2 �߰�*/{
			sum+=i; //sum=sum+i
			System.out.print(i+"\t");
			}
			//200�� �Ѿ�� ���� �� �̻� for���� ����X->�����.
			if(sum>200) break;
		}
		System.out.println("sum=>"+sum);

	}

}
