package j0608;
//����(=boolean)(�Ҹ�)(������), ������(char)- �ѱ��� ����, �ѱ��� �̻�=>String
public class VarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("������ �� ����(LogicTest)");
       boolean b=true; //�ҹ��ڸ� �Է� ����-> True,TRUE(X)
       boolean b2=2>3;//false-> ���� �����ڸ� ���ؼ� �� ���� ����
       System.out.println("b=>"+b+",b2->"+b2);
       System.out.println("������");//char,String
       char c1='A'; //���������� 'A'-> 65�� ���� (��ǻ�� ��ü������ ������ ����!), B->66,C->67,,,
       char c2=65;//�ƽ�Ű�ڵ尪=>'A'��!  65->'A','B' int c2=66(���� ���� ����)
     //���� ������ 16���� ���·� �Է� �޾� ���ڷ� ���� ('\u0000 ~ \uFFFF')  //u=unicode
       char c3='\u0041'; // u�� �� �� �ڿ��� �ڸ����� ����(���� �κ��� 0 ä��)
       System.out.println("c1=>"+c1+",c2->"+c2+",c3->"+c3);
       //���ڿ�=> ����+���� => 'a'+'b'=> "ab"
       //���ڿ�+���ڿ�= ���ڿ�
       //����+���ڿ�=���ڿ�
       String s1="�ڹ� ���� ����";
       String s2="������";
       //�� ���ڿ�=> ���ڿ� ���ο� ������ �� ���ڿ�
       String s3=s1+" "+s2;// like || ' ' || in ����Ŭ
       System.out.println("s3=>"+s3);
	}

}
