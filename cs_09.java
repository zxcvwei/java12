import java.util.Scanner;

public class cs_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�Ѹ��Ʀr");
		long a=scn.nextLong();/*long�s�����Ʀr���j*/
		int[] num = new int[10];
		for(int i=9;i>=0;i--){
			num[i]=(int) (a%10);/*long�g�L���k��ƫ��A�ݩ�int*/
			a=a/10;
		}
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		/*int sum[] = new int [10];
		for(int i=0;i<10;i++){
			sum[i]=num[i]*x[9-i];
		}  ��Ӻ⦡�s�b�}�C �n�ۤv�A�[�@��*/
		long sum=0;
		for(int i=0;i<10;i++){
			sum=sum+num[i]*x[9-i];
		}
		long f = sum%11;
		if(f==0){
			System.out.print("ISBN�Ѹ����T");
		}else{
			System.out.print("ISBN�Ѹ����~");
		}
		
	}
}
