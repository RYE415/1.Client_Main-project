package j0617;

//1���� �迭�� ����
public class ArrayTestTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {58,38,12,36,41,27,26,32,59,16,18,28,17};//14��
		//10~50�� ����->20�� ���?(20~29)
		int count=0;//20�� ����
		//int count2,count3,count4,count5;//�̷��� ���� �迭�� ����.
		int cnt[]=new int[5];//cnt[0]~cnt[4] �� ���뺰�� �迭�� ����
		
		for(int i=0;i<b.length;i++) {
			if(b[i]>=10 && b[i]<=19) cnt[0]++;//0->1->2,,,
			if(b[i]>=20 && b[i]<=29) cnt[1]++;
			if(b[i]>=30 && b[i]<=39) cnt[2]++;//->1
			if(b[i]>=40 && b[i]<=49) cnt[3]++;
			if(b[i]>=50 && b[i]<=59) cnt[4]++;//->1
			
		}//for
		//System.out.println("10�� �ο���="+count+"��");
		for(int i=0;i<cnt.length;i++) {
			System.out.println((i+1)*10+"�� �ο� ��=>"+cnt[i]+"��");
		}
	
	
	}
	

}
