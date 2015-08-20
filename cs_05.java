import java.util.Scanner;

public class cs_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個十進制的正整數");
		int n = scn.nextInt();
		System.out.println("請輸入新進制b(1<b<10)");
		int b = scn.nextInt();
		System.out.println(fun1(n, b));
	}
	public static String fun1(int m, int a) {
		int n = m;
		int b = a;
		String str = "";
		while (n >= b) {
			str = Integer.toString(n % b) + str;
			n = n / b;
		}
		if (n % b < b) {
			str = Integer.toString(n % b) + str;
		}
		return str;
	}
}
