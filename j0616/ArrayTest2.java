package j0616;

//1���� �迭�� ����
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {58,38,12,36,41,27,26,32,59,16,18,28,17};//14��
		//10~50�� ����->20�� ���?(20~29)
		int count=0;//20�� ����
		
		for(int i=0;i<b.length;i++) {
			if(b[i]>=20 && b[i]<=29){
				count++; //ã�� ������ŭ ����
				System.out.println("b["+i+"]=>"+b[i]);//���
			}//if
		}//for
		System.out.println("20�� �ο���(count)=>"+count);
	}
	

}
