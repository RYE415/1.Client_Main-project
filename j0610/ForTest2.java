package j0610;
//����� �� �ٸ� ��� => ��ø for��(=���� for��)***
//for(int dan=3;dan<=7;dan++) //�� -> ������ -> 3��,?
//		for(int times=1)
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ø for��(=���� for��)");
		//        1)     2)14)
		for(int a=0;a<5;a++) /*�ٱ�����*/{//13)a=1       //�ٱ� ���� �ѹ� �� �� ���� ���� 5�� ���ư�! <5�ϱ�.
			//        3)    4)7)10)  6)9)
			for(int b=0;b<5;b++)/*���ʷ���*/{
				System.out.println("a="+a+",b="+b);//5)8)11)
			}//inner for
			System.out.println("================"); //12)
		}//outer for

	}//main

}
