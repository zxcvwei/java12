import java.util.Scanner;
public class cs_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正整數(不含0)");
		long num = scn.nextLong();
		int dig = 0;
		System.out.println(fun1(num, dig)+"位數");
	}
	public static int fun1(long a, int dig) {
		while (a != 0) {
			a = a / 10;
			dig++;
		}
		if (a == 0) {
			return dig;
		} else {
			return dig;
		}
	}
}
	/*public static int fun1(long a, int dig) {
		if (a != 0) {
		dig++;
			return fun1(a/10,dig);
		} else {
			return dig;
		}
	}*/
	

