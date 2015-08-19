import java.util.Random;

public class cs_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int num = rnd.nextInt(1000) + 1;
		String a[] = { "¤¸", "¬B", "¨Õ", "¥a" };
		int b[] = fun1(num);
		for (int k = 3; k >= 0; k--) {
			System.out.print(b[k] + a[k]);
		}
	}
	public static int[] fun1(int num) {
		int n = num;
		int m[] = new int[4];
		int i = 0;
		while (n != 0) {
			m[i] = n % 10;
			n = n / 10;
			i++;
		}
		return m;
	}

}
