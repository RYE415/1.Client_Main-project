package j0613;//���� ��Ű���� �ҷ��� ��Ű���� �����ϸ� �ڵ����� �ҷ���.

public class TVHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. TV-> ��ü(tv)(���� ����=>����� �ٸ�(size))
		TV smartTV=new TV();
		// 2. ��ü��(��ġ).�������=������ ��
		smartTV.name="�Ｚ smartTV";
		smartTV.maker="�Ｚ";
		smartTV.color="������";
		smartTV.size=50;
		
		//3.�ֹ�->���->��ġ
		smartTV.turnOn();//��ü��.ȣ���� �޼���() or (~)
		smartTV.channelUp(45);
		smartTV.channelDown(15);//45-15=30
		smartTV.speakChannel("ocn");
		//��ü ä�� ��ǥ
		smartTV.tvDisplay();
		smartTV.turnOff();
		//smartTV.tvDisplay();

	}

}
