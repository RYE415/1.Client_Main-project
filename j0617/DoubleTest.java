package j0617;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2���� �迭�� ���� �� �����迭");
		//����)�迭�� �ڷ��� �迭��[][]=new �ڷ���[���][����]
		int c[][]=new int[3][3];//c[0][0]=10,c[0][1]=20,,c[2][2]=90
		//2.����) �迭�� �ڷ��� �迭��[][]={{��1,��2,,,}{��1,��2,}{}}//��
		//int b[][]= {{10,20,30},{40,50,60},{70,80,90}};//�迭 ���ʿ� {}�� 3��
		//	�����迭=>���� ������ �ִµ� ���� �׶����� �ٲ�� ���
		int b[][]= {{10,20,30},{40,50},{60,70,80,90}};
		//		b[0][0],b[0][1]			b[1][1]			b[2][3]	=>90
		for(int i=0;i<b.length;i++) {//b.length(���� ��)
			//System.out.println("b["+i+"]="+b[i]);//���� ������ �ּҰ�
			for(int j=0;j<b[i].length;j++) {
				System.out.println("b["+i+"]["+j+"]="+b[i][j]);
			}//inner for
		}//outer for
		System.out.println("==Ȯ�� for��(2���� �迭) �迭�� ÷�ھ���==");
		/*		   for(2���� �迭�� �ڷ��� �迭��[][]:3���� �迭��)//[][][](x)
		 * ����) for(1���� �迭�� �ڷ��� �迭��[]:2���� �迭��) //[][](X)
		 * 				for(1���� �迭�� �ڷ��� ��º���:1���� �迭��) //[](X)
		 */
		int sum=0;
		//for(int b[][]:s){//s[][][] �� �� ��}
		for(int temp[]:b) {//2���� �迭 b���� 1���� �迭�� ���� �ϳ��� temp ����//temp���ø�->���� ����
			for(int su:temp) {//1���� �迭 temp->������ ���� su�� ����
				System.out.print(su+"\t");//��Ű��ŭ �Ÿ��� �����鼭 ���
				sum+=su;
			}
			System.out.println();//���� �ٲ� ������ �ٹٲ�.
		}//outer
		System.out.println("sum=>"+sum);
	}

}
