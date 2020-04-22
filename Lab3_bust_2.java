import java.util.Scanner;

public final class Lab3_bust_2 {
	
	public static void main (String[] args) {
		System.out.println("Lab 3 program. Working with points in 2d.");
		
		// ���� ������ ���짮��⥫��
		Scanner in = new Scanner(System.in);
		double x, y, z;
		Point2d p1, p2, p3;
		
		// Point2d p1
		System.out.print("\n������ ���न���� x �窨 1: ");
		x = in.nextDouble();
		System.out.print("������ ���न���� y �窨 1: ");
		y = in.nextDouble();
		p1 = new Point2d(x, y);
		
		// Point2d p2
		System.out.print("\n������ ���न���� x �窨 2: ");
		x = in.nextDouble();
		System.out.print("������ ���न���� y �窨 2: ");
		y = in.nextDouble();
		p2 = new Point2d(x, y);
		
		// Point2d p3
		System.out.print("\n������ ���न���� x �窨 3: ");
		x = in.nextDouble();
		System.out.print("������ ���न���� y �窨 3: ");
		y = in.nextDouble();
		p3 = new Point2d(x, y);
		
		System.out.println("\n��窨 ᮧ����!\n");
		in.close();
		
		// �᫨ ��㣮�쭨� �� ����稫��
		if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
			System.out.println("���� �窨 � ᮢ�����騬 �ᯮ��������, ���᫨�� ���頤� ��㣮�쭨�� ����������, ⠪ ��� ��� ��㣮�쭨��!");
		}
		else {
			//������� ���頤� ��㣮�쭨��
			double s = computeArea(p1, p2, p3);
			System.out.println("���頤� ����稢襣��� ��㣮�쭨�� �� ���᪮�� = " + fittingAnswer(s));
		}
		
	}
	
	//������� ���頤� ��㣮�쭨�� �� 3-� �窠�
	public static double computeArea(Point2d p1, Point2d p2, Point2d p3) {
		// ���頤�
		double s;
		// ���㯥ਬ���
		double p;
		double a, b, c;
		
		a = Math.abs(p1.distanceTo(p2));
		System.out.println("\ta = " + a);
		b = Math.abs(p2.distanceTo(p3));
		System.out.println("\tb = " + b);
		c = Math.abs(p1.distanceTo(p3));
		System.out.println("\tc = " + c);
		p = (a + b + c) / 2;
		System.out.println("\tp = " + p);
		s = Math.pow((p*(p - a)*(p - b)*(p - c)), 0.5);
		System.out.println("\ts = " + s);
		
		return s;
	}
	
	// �᫨ �᫮ ��������� 8.998888888901 ��� 8.998, � ����� ��⮤ ���㣫�� ��� �� 9
	public static double fittingAnswer(double n) {
		// �᫨ ���� ���� ��᫥ ����⮩ �� 9, � ���㣫���� �� �ॡ����, ���� ᬮ�ਬ �� ��஥ �᫮
		double n0 = n * 10;
		int in = (int)Math.round(n0);
		if (in % 10 != 9) return n;
		
		// �᫨ ��ன ���� ��᫥ ����⮩ �� 9, � ���㣫���� �� �ॡ����, ���� ���㣫塞
		double n1 = n * 100;
		in = (int)Math.round(n1);
		if (in % 10 == 9) {
			return Math.round(n);
		}
		
		// �᫨ ��⨩ ���� ��᫥ ����⮩ �� 9 ��� 8, � ���㣫���� �� �ॡ����, ���� ���㣫塞
		double n2 = n * 1000;
		in = (int)Math.round(n2);
		if (in % 10 == 9 || in % 10 == 8) {
			return Math.round(n);
		}
		
		return n;
	}
}