import java.util.Scanner;

public class cs_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�r��");
		String a = scn.nextLine();
		int c[]/*int c*/ = fun1(a);
		int sum = 0;/*for�j��ٲ�*/
		for (int i = 0; i < c.length; i++) {
			sum = sum + c[i];
		}
		System.out.print(" " + sum);
	}
	public static int[]/*int�����^��sum*/ fun1(String a) {
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
		return c/*c�אּsum*/;
	}
}
