import java.util.Scanner;
public class cs_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入單月分使用時間(分鐘)");
		int min = scn.nextInt();
		float sum;
		if(min <= 600){
			sum = (float)(min*0.5);
			System.out.println(sum+"元");
		}else if(min>600 && min<=1200){
			sum = (float)(min*0.5*0.9);
			System.out.println(sum+"元");
		}else{
			sum = (float)(min*0.5*0.79);
			System.out.println(sum+"元");
		}
		
	}

}
