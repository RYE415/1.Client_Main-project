package j0616;

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
		//�߰�
		System.out.println("==�����޼��带 �ҷ��ͼ� ���==");
		//�ܼ�,�������� ���->���밪,�ִ밪,�ּҰ�,,->�����޼���(java,lang,Math)
		//API����(������ ����)=>shift+F2(Ŭ������ ���� Ŀ���� ���ʿ� �ְ�)
		int abs=-500;
		
		abs=(abs<0)?-abs:abs;
		System.out.println("���밪 abs=>"+abs);
		
		abs=Math.abs(-2500);//Ŭ������.�����޼����(~)
		System.out.println("���밪 abs=>"+abs);
		
		//�ִ밪 java.lang.max(int a,int b)=>�ִ밪
		int max=Math.max(34,98);
		System.out.println("�ִ밪(max)=>"+max);
		
		int min=Math.min(34,98);
		System.out.println("�ִ밪(min)=>"+min);
		//���� �⺻���� ���->���� �޼���->�ҷ��� ���
		//������ �ʿ�->�Ϲ� �޼��� �ۼ�
		
	}

}
