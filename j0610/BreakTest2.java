package j0610;
//����� �� �ٸ� ��� => ��ø for��(=���� for��)***
//for(int dan=3;dan<=7;dan++) //�� -> ������ -> 3��,?
//		for(int times=1)
public class BreakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���̺��� �ִ� Break��");
		A://���̺��:
		for(int a=0;a<5;a++) 	{	
			for(int b=0;b<5;b++){
				//�߰�
				if(b==2) break A; //����) ���ǽ� break ���̺��;  -> ���̺�� ���� �� ���̺��� Ż���ض� 
											  //���̺��� ������ -> ���� ����� ���� Ż��.
				System.out.println("a="+a+",b="+b);
			}//inner for
			System.out.println("================"); 
		}//outer for

	}//main

}
