import java.util.*;
public class CodeUp_Basic_100Problem {
	
	private static final char A = 0;

	

	public static void main(String[] args) {
		
		/*1003 �ٹٲ� ���
		System.out.println("Hello\nWorld");
		*/
		/*1005 ū����ǥ ���� ���
		System.out.println("\"Hello\"");
		*/
		/*1006 ū����ǥ ���� Ÿ ���� ���
		System.out.println("\"!@#$%*()\"");
		*/
		/*1007 "C:\Download\hello.cpp" �� ���
		System.out.println("\"C:\\Download\\hello.cpp\"");
		*/
		/*1008 Ư�����ڸ� ���
		System.out.println("\u250C\u252C\u2510\n");
		System.out.print("\u251C\u253C\u2524\n\n");
		System.out.print("\u2514\u2534\u2518\n");
		*/
		/*1010 ������(int)���� ������ �����ϰ�, ������ �������� ������ �� ������ ����Ǿ� �ִ� ���� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.printf("%d", i);
		*/
		/*1011 ������(char)���� ������ �ϳ� �����ϰ�, ������ ���ڸ� ������ �� ������ ����Ǿ� �ִ� ���ڸ� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.print(st);
		*/
		/*1012 �Ǽ���(float)�� ������ �����ϰ� �� ������ �Ǽ����� ������ �� ����Ǿ� �ִ� �Ǽ����� ����غ���.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.print(fl);
		*/
		/*1013 ����(int) 2���� �Է¹޾� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i+"\n"+j);
		*/
		/*1014 2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(b + "\n" + a);
		*/
		/*1015 �Ǽ�(float) 1���� �Է¹޾� ������ ��, ����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.printf("%.2f", fl);
		*/
		/*1017 int�� ���� 1���� �Է¹޾� ������ ���̿� �ΰ� 3�� ����غ���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a, a, a);
		*/
		/*1018 � ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int minute = sc.nextInt();
		System.out.printf("%d : %d", time, minute);
		*/
		/*1031 10������ �Է¹޾� 8����, 16������ ����غ���.
		Scanner sc = new Scanner(System.in);
		int demi_to_ox = sc.nextInt();
		System.out.printf("%d, %o %x", demi_to_ox, demi_to_ox, demi_to_ox);
		*/
		/*1037 ���� �Է¹޾� ASCII CODE ���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char b = (char) a;
		System.out.println(b);
		*/
		/*1041 ���� �Է¹޾� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c", c+1 );
		*/		
		/*1042 ���� 2��(a, b) �� �Է¹޾� a�� b�� ���� ���� ����غ���.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a/b);
		*/
		/*1044 ������ 1�� �Է¹޾� 1��ŭ ���� ����غ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a+1);
		*/
		/*1045 ���� 2�� �Է¹޾� �ڵ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d", a+b, a/b, a*b, a%b, a-b);
		*/
		/*1046 ���� 3�� �Է¹޾� �հ� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(); 
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.printf("%.1f %.1f", a+b+c, (a+b+c)/3);
		*/
		/*1047 Shift�� �̿��� ���� 1�� �Է¹޾� 2�� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d", a<<1); // a�� 2^1�� ���ؼ� ���. 
		*/
		/*1048 �� ���� 2�� �ŵ����� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("a�� 2^b�� ���ϸ� : ");
		System.out.printf("%d", a<<b);
		*/
		/*1050 �� ���� �Է¹޾� ���ϱ�1
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		*/
		/*1052 �� ���� �Է¹޾� ���ϱ�4
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		*/
		/*1053 �� ���� �ٲٱ�
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		if(a==true) {
			System.out.print(!a);
		}
		*/
		/*1054 �� �� ���� ��츸 �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		if(a==true && b==true) {
			System.out.print(true);
		}
		else System.out.print(false);
		*/
		/*1059 ��Ʈ������ NOT �Ͽ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d", ~a); // bitwise -�� 0�ǰ��� +1 �ϰ� -���̸��
		*/
		
		/*1060 ��Ʈ������ AND �Ͽ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d", a&b);
		*/
		/*1063 �� ���� �Է¹޾� ū �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a>b ? a:b);
		*/
		/*1064 ���� 3�� �Է¹޾� ���� ���� �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print((a>b ? a:b) < c ? c:(a>b ? a:b) );
		*/
		/*1065 ���� 3�� �Է¹޾� ¦���� ����ϱ�
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}
		else {
			System.out.print("¦�� ����");
		}
		*/
		/*1066 ���� 3�� �Է¹޾� ¦/Ȧ ����ϱ�(����)
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(b%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(c%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		*/
		/*1067 ���� 1���� �ԷµǾ��� ��, ��(minus)/��(plus)�� ¦(even)/Ȧ(odd)�� ����غ���.
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			if(a>0) {
				System.out.print("PLUS & EVEN");
			}
			else {
				System.out.print("MINUS & EVEN");
			}
		}
		
		else {
			if(a>0) {
				System.out.print("PLUS & ODD");
			}
			else {
				System.out.print("MINUS & ODD");
			}
		}
		*/
		/*1069 �� �Է¹޾� �ٸ��� ����ϱ�
		Scanner sc = new Scanner(System.in); 
		char gr = sc.next().charAt(0);
		if(gr == 'A') {
			System.out.print("best!!");
		}
		*/
		/*1070 �� �Է¹޾� ���� ����ϱ�
		Scanner sc = new Scanner(System.in); 
		int weather = sc.nextInt();
		switch(weather) {
			case 1 : System.out.print("Winter"); break;
			case 2 : System.out.print("Winter"); break;
			case 3 : System.out.print("Spring"); break;
			case 4 : System.out.print("Spring"); break;
			case 5 : System.out.print("Spring"); break;
			case 6 : System.out.print("Summer"); break;
			case 7 : System.out.print("Summer"); break;
			case 8 : System.out.print("Summer"); break;
			case 9 : System.out.print("fall"); break;
			case 10 : System.out.print("fall"); break;
			case 11 : System.out.print("fall"); break;
			case 12 : System.out.print("Winter");			
		}
		*/
		/*1071  0 �Էµ� ������ ���� ����ϱ�1
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			System.out.println(num);
		}
		*/
		/*1072 ���� �Է¹޾� ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ : ");
		int num = sc.nextInt();
		int[] temp = new int[num];
		for(int i = 0; i<temp.length; i++) {
			temp[i] = i+1;
		}
		for(int i = 0; i<temp.length; i++) {
			System.out.print(" "+temp[i]);
		}
		*/
		/*1074 ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�1 (for�� ���)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i>0; i--) {
			System.out.println(i);
		}
		*/
		/*1075 ���� 1�� �Է¹޾� ī��Ʈ�ٿ� ����ϱ�2 (while�� ���)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num != 0) {
			num--;
			System.out.println(num);
		}
		*/
		/*1076 ���� 1�� �Է¹޾� ���ĺ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		do {
			System.out.println(c);
			c--;
		}while(c>64);
		*/
		/*1077 ���� 1�� �Է¹޾� �� ������ ����ϱ�
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i<a; i++) {
			System.out.println(i);
		}
		*/
		/*1078 [����-����] ¦�� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int even_sum = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<=even_sum; i++) {
			if(i%2 == 0) {
				sum += i;
			}			
		}
		System.out.print(sum);
		*/
		/*1079 ���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		char until_q = sc.next().charAt(0);
		while(until_q != 'q') {
			until_q = sc.next().charAt(0);
			System.out.println(until_q);
		}
		*/
		/*1080 [����-����] �������� ���ؾ� �ұ�?
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int temp = 0;
		for(int i = 0; sum<=a; i++) {
			sum += i;
			temp = i-1;
		}
		System.out.print(temp);
		*/
		/*1081 [����-����] �ֻ����� 2�� ������?
		int n = (int) (Math.random()*10) + 1;
		int m = (int) (Math.random()*10) + 1;
		
		System.out.print("�ֻ��� �� : ");
		System.out.println(n + " " + m);
		System.out.println("����� ��");
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=m; j++) {
				System.out.println(i + " " + j);
			}
		}
		*/
		

		
		
		
		
	}

}
