package j0617;

//���� �迭 + �����ε� => ���� �߰��� ����
//���� �迭 : ������ ������ �ڵ����� �þ�� �����ϸ� �ڵ����� �پ��� �迭
public class VarArgTest {

	//�����ε�->�Ű������� ������ �޶����� ���(�ڷ����� ����)
	/*
	public void print(String a) {
		System.out.println("a=>"+a);
	}
	public void print(String a,String b) {
		System.out.println("a=>"+a+",b=>"+b);
	}
	public void print(String a,String b,String c) {
		System.out.println("a=>"+a+",b=>"+b+",c=>"+c);
	}
	*/
	//�����迭�� ���� ���=>�ݵ�� �ڷ����� ���ƾ� �Ѵ�.(�迭)
	//�Ϲ����� �޼��� �ۼ������ ����->(�ڷ���..�迭��)//�迭ǥ��[] (x)
	//�ٸ� �Ű������� ���� ����ϴ� ��쿡�� �ݵ�� �Ű����� �ڿ� �;� �Ѵ�.
	//public void print(String str2,String ...names){} //OK
	//public void print(String ...name,String str2({}//(X)
	public void print(String ...names) {//�Ű������� ������ ������� �޼��� �ϳ��� ����
		/*
		 * String names[]={"ȫ�浿"} //vat.print("ȫ�浿");
		 * String names[]={"ȫ�浿","�׽�Ʈ"} //vat.print("ȫ�浿","�׽�Ʈ");
		 */
		for(String str:names)
			System.out.println(str+"\t");
		System.out.println();
	}
	public void print2(String names[]) {//�����迭�� �Ű������� ���
		for(String str:names)
			System.out.println(str+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgTest vat=new VarArgTest();
		//�߰�
		String str[]= {"�迭�� Ȱ��","�����迭","API���� �����ϴ� ��"};
		vat.print2(str);
		//--------------------------------------------------------------
		vat.print("ȫ�浿");
		vat.print("ȫ�浿","�׽�Ʈ");
		vat.print("ȫ�浿","�׽�Ʈ","�ӽ�"); //���� �޼���� ���� ���缭 �˾Ƽ� ã�ư�-3���� 3��¥��,,
		vat.print("ȫ�浿","�׽�Ʈ","�ӽ�","�ӽ�2");
		vat.print("ȫ�浿","�׽�Ʈ","�ӽ�","�ӽ�2","�ӽ�3");
		vat.print("ȫ�浿","�׽�Ʈ","�ӽ�","�ӽ�2","�ӽ�3","�ӽ�4");

	}

}
