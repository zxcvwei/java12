import java.util.Scanner;

public class cs_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¤@¦r¦ê");
		String a = scn.nextLine();
		char c[] = fun1(a);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
	public static char[] fun1(String a) {
		String a1 = a;
		char b[] = a1.toCharArray();
		char c[] = new char[b.length];
		int j = 0;
		int k = 0;
		while (j < b.length) {
			if (b[j] != ' ') {
				c[k] = b[j];
				k++;
			}
			j++;
		}
		return c;
	}
}
