package j0613; //���� �� ������ ��ģ ��!(���� + ���� ����)
//���� ����+���� ������ Ŭ����
//�������
class Account{
	String name;//������
	String no;//���¹�ȣ=>������X
	long price=1000;//�����ܾ� -> int�� ���� �̹��� long �ẻ ��
	
	//1.�⺻ ���->�ܾ� ��ȸ=>�ܼ�,�ݺ�=>�Ű�����X,��ȯ��X
	void searchPrint() {
		System.out.println(name+"���� ���� �ܾ���"+price+"�Դϴ�.");
	}
	//2.�Ա�=>����=>�Ű�����O,��ȯ��X
	void input(long k) {
		price+=k;//price=1000+5000=6000
		System.out.println(k+"��ŭ �Ա��� �Ϸ��!!!");
	}
	//3.���=>�Է�->�Ű�����O,��ȯ��X
	void output(long k) {
		//�ܾ��� Ȯ��
		//�ܾ��� 0�̰ų� ������ �Ǹ� �ȵȴ�.->if
		if (k<0 || (price-k)<=0){
			System.out.println("�ܾ��� �����մϴ�.");
		}else {//���
			price-=k;
			System.out.println(k+"��ŭ ����� �Ϸ��");
		}
	}//output
	//4.�������� ���->���� ���->�ܼ�,�ݺ�
	void print() {
		System.out.println("==�������� Ȯ��==");
		System.out.println("������=>"+name);
		System.out.println("���¹�ȣ=>"+no);
		System.out.println("�ܾ�=>"+price);
	}
}//class account


public class AccountHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account t=new Account();//�� ���� ������ ���� ������ ���� ����
		t.name="ö��";
		t.no="46-123-0987";
		//�Ա�
		t.input(5000);//1000+5000=6000
		t.output(8000);//�ܾ��� ����
		t.output(4000);//6000-4000=2000
		t.print();

	}

}
