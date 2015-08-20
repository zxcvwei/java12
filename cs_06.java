import java.util.Scanner;

public class cs_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一字串");
		String a = scn.nextLine();
		int c[]/*int c*/ = fun1(a);
		int sum = 0;/*for迴圈省略*/
		for (int i = 0; i < c.length; i++) {
			sum = sum + c[i];
		}
		System.out.print(" " + sum);
	}
	public static int[]/*int直接回傳sum*/ fun1(String a) {
		String a1 = a;
		char b[] = a1.toCharArray();
		int c[] = new int[b.length];
		int j = 0;
		int k = 0;
		while (j < b.length) {
			if ('0' <= b[j] && b[j] <= '9') {
				c[k] = b[j] - '0';
				System.out.print(c[k]);
				/*int sum = 0
				 * sum = sum+c[k]*/	
				k++;
			}
			j++;
		}
		return c/*c改為sum*/;
	}
}
