package j0617;

/*
 * �迭-> 1.�����迭(ó������ �迭�� ũ�Ⱑ ������ �ִ� �迭)
 * 					=> �߰��� ũ�� ���� X ex) int su[]=new int[4];
 * 			  2. ���� �迭 -> �迭�� ���� �����Ű�� �ڵ����� ũ�Ⱑ ����,���ҵǴ� �迭
 * 					=> ex) �÷��� ��ü
 * 				ex)String x[]; x[0]=10
 */
				
public class ArrayDynamic {

	public static void main(String x[]) {//main�� String�� ���� X
		// TODO Auto-generated method stub
		//run configuration=>���� �迭 ������ ������ �� ���
		//���⼭ ���� x[]�� �̹� ������� ���̶� ���� ����� ����!->run configuration 
		int sum=0;
		
		//���ڿ�->���ڷ� ��ȯ
		//Integer.parseInt(��ȯ�� ���ڿ� ���)=>���ڿ�=>���ڷ� ��ȯ
		//����(10)->���ڿ�("10") => ����) String.valueOf(����)
		/*(1)
		String str=x[0];//"10"
		String str2=x[1];//"20"
		String str3=x[2];//"30"   -> run configuration���� ���� ���� =>���� �迭�� �� ���� ���!
		
		int num=Integer.parseInt(str);
		int num2=Integer.parseInt(str2);
		int num3=Integer.parseInt(str3);
		
		sum=num+num2+num3;
		
		System.out.println("str=>"+num);
		System.out.println("str2=>"+num2);
		System.out.println("str3=>"+num3);
		
			System.out.println("sum=>"+sum);
		*/
		//(2) 
		  	int str=Integer.parseInt(x[0]);
			int str2=Integer.parseInt(x[1]);
			int str3=Integer.parseInt(x[2]);
			
			sum=str+str2+str3;
			
			//�߰�
			String str4=String.valueOf(str);//10->"10"(����->���ڿ�)
			//"10.5" -> 10.5 => Double.parseDouble("10.5") // parse :�ɰ���
			double str5=Double.parseDouble("10.5"); //=>���ڿ� -> �Ҽ�
		
		
		//String(������)�� int(�⺻�ڷ���)�� ���� ������ ����.(�ڷ����� �ٸ���->�ٸ� �ڷ��������� �� ��ȯ �ȵ�.)
		//sum=(int)str+(int)str2+(int)str3;
		
		System.out.println("str=>"+str);
		System.out.println("str2=>"+str2);
		System.out.println("str3=>"+str3);
		//�߰�
		System.out.println("sum=>"+sum);//60
		System.out.println("str4=>"+str4);
		System.out.println("str5=>"+str5);

	}

}
