import java.util.Random;

public class cs_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int num = rnd.nextInt(1000) + 1;
		System.out.println("�ӫ~����" + num + "��");
		System.out.println(fun1(num));

	}

	public static String fun1(int num) {
		int pri = 1000 - num;
		System.out.println("�ѤU" + pri + "��");
		int a[] = { 500, 100, 50, 10, 5, 1 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = pri / a[i];
			pri = pri % a[i];
			System.out.println("��^" + b[i] + "��" + a[i] + "��");
		}
		return ("");
	}
}
