package j0614;
//����ó�� ���α׷� �ۼ�->��,��,��->�հ�->���->���->��� ���� ���
public class MethodEx {
	//�����������=>������ ���� ����
	int kor,eng,mat,tot; //��,��,��,����
	double avg; //���
	char grade; //���
	
	//1.����(=�հ�)->��� ����=>��ȯ�� O
	int calcSum() {
		int t=kor+eng+mat;
		return t; //return (kor+eng+mat);
	}
	//2.���=>����/�����->��ȯ�� O
	double clacAvg() {
		return (double)(tot/3);
	}
	//3.���(=����)->���->��ȯ�� O
	char calcGrade() {
		if(avg<=100 && avg>=90) return 'A';
		else if(avg<90 && avg>=80) return 'B';
		else if(avg<80 && avg>=70) return 'C';
		else if(avg<70 && avg>=60) return 'D';
		else return 'F';
	}
	//4.����,���,����� ��� ���=>�ܼ�,�ݺ�->�Ű�����X,��ȯ��X
	void display() {
		System.out.println("�հ�(tot)=>"+tot);
		System.out.println("���(avg)=>"+avg);
		System.out.println("���(grade)=>"+grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü����=>��� ������ ���� ����->�޼��带 ȣ���ϱ� ���ؼ�
		MethodEx me=new MethodEx();
		me.kor=70;
		me.eng=67;
		me.mat=78;
		
		//1.����
		//me.tot=me.kor+me.eng+me.mat;
		me.tot=me.calcSum();
		//System.out.println("�հ�(tot)=>"+me.tot);
		//2.���
		me.avg=me.clacAvg(); //215/3
		
		//3.���
		me.grade=me.calcGrade();
		
		//4.��� �� ���
		me.display();
		
		
	}

}
