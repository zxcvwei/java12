import java.util.Scanner;
public class cs_08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�����ϥήɶ�(����)");
		int min = scn.nextInt();
		float sum;
		if(min <= 600){
			sum = (float)(min*0.5);
			System.out.println(sum+"��");
		}else if(min>600 && min<=1200){
			sum = (float)(min*0.5*0.9);
			System.out.println(sum+"��");
		}else{
			sum = (float)(min*0.5*0.79);
			System.out.println(sum+"��");
		}
		
	}

}
