package j0616;

//�ܺ��� ��Ű���� �����ϴ� Ŭ������ �ҷ����� ��� -> ctrl+shift+O
//����) import �ֻ�����Ű����.������Ű����...�ҷ��� Ŭ������;
import java.util.Scanner;

//����ó�� ���α׷� �ۼ�->��,��,��->�հ�->���->���->��� ���� ���
public class MethodEx {
	//�����������=>������ ���� ����
	/*
	 * �޼��� �ۼ��ϴµ� �Ű����� �ִ� ���, ���ִ� ��� �����ؼ� �ۼ�
	 * 1. ��������� ���� -> �Ű������� ���� �޼��带 �ۼ� O
	 * 2. ��������� ���� X -> ���������� ����� ���
	 * 									��> �Ű������� �ִ� �޼��带 �ۼ� O
	 */
	/* ������� ���� -> ������ ���� ����
	int kor,eng,mat,tot; //��,��,��,����
	double avg; //���
	char grade; //���
	*/
	//1.����(=�հ�)->��� ����=>��ȯ�� O
	//static:�����޼���
	static int calcSum(int kor,int eng,int mat) {
		int t=kor+eng+mat;
		return t; //return (kor+eng+mat);
	}
	//2.���=>����/�����->��ȯ�� O
	static double clacAvg(int tot) {
		return (double)(tot/3);
	}
	//2-2)���2 ������� ���� ������ �Ǵ� ���
	static double calcAvg(int tot,int su) {//1.���� 2.�����
		return(double)(tot/su);
	}
	//3.���(=����)->���->��ȯ�� O
	char calcGrade(double avg) {
		if(avg<=100 && avg>=90) return 'A';
		else if(avg<90 && avg>=80) return 'B';
		else if(avg<80 && avg>=70) return 'C';
		else if(avg<70 && avg>=60) return 'D';
		else return 'F';
	}
	//4.����,���,����� ��� ���=>�ܼ�,�ݺ�->�Ű�����X,��ȯ��X
	void display(int tot,double avg,char grade) {
		System.out.println("�հ�(tot)=>"+tot);
		System.out.println("���(avg)=>"+avg);
		System.out.println("���(grade)=>"+grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü����=>��� ������ ���� ����->�޼��带 ȣ���ϱ� ���ؼ�
		MethodEx me=new MethodEx(); //1.������ ���� �� �޼��� ȣ��
		//�޼��� ���ο��� ����� ����(=��������)
		/*(1)
		int kor=70;
		int eng=67;
		int mat=78;
		*/
		//����ڷκ��� ���� �Է��� �޾Ƽ� ó�����ִ� Ŭ����- Scanner
		//ctrl+shift+O (�ڵ� import ���) =>�ܺ�Ŭ���� ��Ű�� �޾ƿ���-> ���� ���� ǥ�õ�.
		Scanner sc=new Scanner(System.in);
		System.out.println("1.����������?");
		//����(next(�ܾ�),nextLine(�� ����))
		//����(nextInt(����),nextDouble(�Ҽ���))
		int kor=sc.nextInt();
		
		System.out.println("2.����������?");
		int eng=sc.nextInt();
		
		System.out.println("3.����������?");
		int mat=sc.nextInt();
		
		System.out.println("4.�̸���?");
		String name=sc.next();
		System.out.println("�̸��� "+name+"�̱���!");
		
		//1.����
		//me.tot=me.kor+me.eng+me.mat;
		//�����޼���:Ŭ������.�����޼����(~)
		int tot=MethodEx.calcSum(kor,eng,mat);
		//System.out.println("�հ�(tot)=>"+me.tot);
		//2.���
		double avg=MethodEx.clacAvg(tot); //215/3
		
		//�Ϲݸ޼���
		//3.���
		char grade=me.calcGrade(avg);
		
		//4.��� �� ���
		me.display(tot,avg,grade);
		
		
	}

}
