package j0616;

public class WhileTest3 {
	//��������� ����
	int start2=50;
	int end2=70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������->�Ϲ� �޼��� ȣ�� �� �Ű������� �����ؾ� ���
		//->��������:�޼ҵ� ���� ����->�޼ҵ� ����� �����.
		int start=50; //���۰� 
		int end=100; //���ᰪ 
		//�ݺ��� Ƚ�� -> 1���� ������ �Ŵϱ� //���ѷ���=> ���� ���� ��� ������ �Ǵ� ����
		/*if(start < end) {
		while(start<=end) {
			System.out.println("while���� ����"+start);
			start++;
		}
		}else {//start>=end
			System.out.println("start���� end������ Ŭ ���� ����.");
		}
		System.out.println("while���� ����");
	*/
		WhileTest3 wt=new WhileTest3();
		wt.whilePrint(start, end);//50,100
		wt.whilePrint(90, 150);
		wt.whilePrint(100, 200);
		wt.whilePrint();
	}
	//���뼺
		void whilePrint(int start,int end) {
			if(start < end) {
				while(start<=end) {//50<=100
					System.out.println("while���� ����"+start);
					start++;
				}
				}else {//start>=end
					System.out.println("start���� end������ Ŭ ���� ����.");
				}
				System.out.println("while���� ����");
				System.out.println("====================");
		}
		//�޼��� �����ε� ���
		void whilePrint() {
			if(start2 < end2) {
				while(start2<=end2) {//50<=100
					System.out.println("while���� ����"+start2);
					start2++;
				}
				}else {//start>=end
					System.out.println("start2���� end2������ Ŭ ���� ����.");
				}
				System.out.println("while���� ����");
				System.out.println("====================");
		}
}
