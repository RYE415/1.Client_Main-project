package j0610;
/*
 * �ݺ��� -> Ư�� ���ǿ� ���� �ݺ��ؼ� ������ �Ǵ� ����
 * 			=> �ݺ��ؼ� ���Ǵ� ����
 * 
 * 1. �ݺ��� Ƚ���� ������ �ִ� ��� --> for, while
 * 2. �ݺ��� Ƚ���� ������ ���� ���� ��� --> for(X),while(����� ���α׷�)
 */

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) �ݺ��� Ƚ�� : 5 (2) �ݺ��ؼ� ������ ����
//		System.out.println("while���� ����1");// 1-> start(���۰�)
//		System.out.println("while���� ����1");
//		System.out.println("while���� ����1");
//		System.out.println("while���� ����1");
//		System.out.println("while���� ����1");// 5->end(���ᰪ)
		
		int i=7; //�ݺ��� Ƚ�� -> 1���� ������ �Ŵϱ�
		//���ѷ���=> ���� ���� ��� ������ �Ǵ� ����
		/*
		while(i<=100) {
			System.out.println("while���� ����"+i);
			i++;//i=i+1, i+=1
		}
		*/
		//**while������ do~while������ ������!**
		do {
			System.out.println("while���� ����"+i);
			i++;
		}while(i<=5);//���ǽĿ� ;�� ���� ������ ���
		//������ �����̶� �ѹ��� ������->������ ���߿� üũ�ϱ� ����! like ������
		System.out.println("while���� ����");

	}

}
