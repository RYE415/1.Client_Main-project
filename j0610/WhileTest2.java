package j0610;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int start=50; //���۰� start:just �����̸�,��ǻ�Ͱ� �� �� ���� �׳� �츮�� ������ ����
		int end=100; //���ᰪ end:                     ,,
		//�ݺ��� Ƚ�� -> 1���� ������ �Ŵϱ� //���ѷ���=> ���� ���� ��� ������ �Ǵ� ����
		if(start < end) {
		while(start<=end) {
			System.out.println("while���� ����"+start);
			start++;
		}
		}else {//start>=end
			System.out.println("start���� end������ Ŭ ���� ����.");
		}
		System.out.println("while���� ����");

	}

}
