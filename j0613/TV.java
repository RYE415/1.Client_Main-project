package j0613;
//���ȿ� TV
public class TV {

	//1. ������ ������ Ư��
	String maker;//������->null(default) ������ ���� X
	String name; //�𵨸�
	String color; //����
	int size; //��ġ->default: int-> 0, boolean->false, double->0.0 ������� ���ڷ� �����ϹǷ� int!
	//����
	boolean power=false;//��������
	int channel;//0
	
	//2.TV���
	//	1)�������� ���� on -> �ܼ�,�ݺ�->�Ű����� X,��ȯ��X
	void turnOn() {
		power=!power;//power=true;//!false, !:��������(Not=�ݴ�Ǵ� ��)
		System.out.println("�ε���...TV���� ON");
	}
	//	2)�������� ���� off
	void turnOff() {
		power=!power; //power=false
		System.out.println("TV ���� off");
	}
	//	3)ä�� up���=>����=> ���� �Է� �Ű����� O ��ȯ��X =>������ �Է�=>����,���,���
	void channelUp(int ch) {
		channel=ch;//channel+=ch;->�̷��Ե� ����
		System.out.println("���� ����� ä����"+channel);
	}
	//	4)ä�� down���
	void channelDown(int ch) {
		channel-=ch;
		System.out.println("���� ����� ä����"+channel);
	}
	//	5)TVä������=>ä����ǥ->�ܼ�,�ݺ�
	void tvDisplay() {
		System.out.println("==TV���� ���==");
		System.out.println("�𵨸�=>"+name);
		System.out.println("����=>"+color);
		System.out.println("����ä��=>"+channel);
		System.out.println("��������=>"+power);
	}
	//	6)���ϸ� ä�κ�����=>�Ű�����O=>��(String),��ȯ��X
	void speakChannel(String ch) {//ex) "ocn"->35��,"sport"->120��
		//String��ü=>���ڿ� ��(equals("���� ���ڿ�") ��ҹ��� ���� O 
		//									 equalsIgnoreCase=> ��ҹ��� ���� X )
		if(ch.equals("ocn")) {
			channel=35;
		}else if(ch.contentEquals("sports")) {
			channel=129;
		}
		System.out.println("���� ä����"+channel+"�� �̵����Դϴ�");
	}
	
}
