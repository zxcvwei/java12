import java.util.Scanner;

public class cs_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入書號數字");
		long a=scn.nextLong();/*long存取的數字較大*/
		int[] num = new int[10];
		for(int i=9;i>=0;i--){
			num[i]=(int) (a%10);/*long經過除法資料型態屬於int*/
			a=a/10;
		}
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		/*int sum[] = new int [10];
		for(int i=0;i<10;i++){
			sum[i]=num[i]*x[9-i];
		}  單個算式存在陣列 要自己再加一次*/
		long sum=0;
		for(int i=0;i<10;i++){
			sum=sum+num[i]*x[9-i];
		}
		long f = sum%11;
		if(f==0){
			System.out.print("ISBN書號正確");
		}else{
			System.out.print("ISBN書號錯誤");
		}
		
	}
}
