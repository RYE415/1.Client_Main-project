package j0609;

public class IFtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����-> ����ڷ� ���� �Է� -> scanner��ü(6�� ������ �Ŀ� ���)
		//¦��,Ȧ�� �Ǻ�(��� /2==>2�� ���, /3==0(3�� ���)

		int su=29;
		//if (su%2==1) //���ǽ�(����,������(����,��))
		//		System.out.println(su+"�� ¦���Դϴ�.");
		//�ϳ��� ���ǽĿ� ���� ó���ؾ� �� ������ �ϳ� �̻��� �� {  }
		//% :������, su%2==0 -> su�� 2�� ������ �� �������� 0
		if(su%2==0) {
			System.out.println(su+"�� ¦���Դϴ�.");
			System.out.println("��ó�� ����1");
		}else {
			System.out.println(su+"�� Ȧ���Դϴ�.");
			System.out.println("��ó�� ����2");
		System.out.println(su);
		}
		//1:1 ���� ��� -> if�� 2���� ���� else�� 2����!, 2���� �̻��̸� {}�� �����ֱ�
		//���� if�� { }�� ó���ϸ� �Ʒ� else�� �ϴ� �� ��Ģ!
		System.out.println("==���׿����ڷ� ����===");
		String su2=(su%2==0)?"¦���Դϴ�.":"Ȧ���Դϴ�.";
		//����? A:B -> A:true, B:false
		System.out.println("�Է¹��� ��(su2)=>"+su2);
		System.out.println("if����");//������
	}

}
