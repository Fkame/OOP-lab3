import java.util.Scanner;

public final class Lab3_bust_2 {
	
	public static void main (String[] args) {
		System.out.println("Lab 3 program. Working with points in 2d.");
		
		// Ввод данных пользователем
		Scanner in = new Scanner(System.in);
		double x, y, z;
		Point2d p1, p2, p3;
		
		// Point2d p1
		System.out.print("\nВведите координату x точки 1: ");
		x = in.nextDouble();
		System.out.print("Введите координату y точки 1: ");
		y = in.nextDouble();
		p1 = new Point2d(x, y);
		
		// Point2d p2
		System.out.print("\nВведите координату x точки 2: ");
		x = in.nextDouble();
		System.out.print("Введите координату y точки 2: ");
		y = in.nextDouble();
		p2 = new Point2d(x, y);
		
		// Point2d p3
		System.out.print("\nВведите координату x точки 3: ");
		x = in.nextDouble();
		System.out.print("Введите координату y точки 3: ");
		y = in.nextDouble();
		p3 = new Point2d(x, y);
		
		System.out.println("\nТочки созданы!\n");
		in.close();
		
		// Если треугольник не получился
		if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)) {
			System.out.println("Есть точки с совпадающим расположением, вычислить площадь треугольника невозможно, так как нет треугольника!");
		}
		else {
			//Рассчёт площади треугольника
			double s = computeArea(p1, p2, p3);
			System.out.println("Площадь получившегося треугольника на плоскости = " + fittingAnswer(s));
		}
		
	}
	
	//Рассчёт площади треугольника по 3-м точкам
	public static double computeArea(Point2d p1, Point2d p2, Point2d p3) {
		// Площадь
		double s;
		// Полупериметр
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
	
	// Если число наподобии 8.998888888901 или 8.998, то данный метод округлит его до 9
	public static double fittingAnswer(double n) {
		// Если первый знак после запятой не 9, то округление не требуется, иначе смотрим на второе число
		double n0 = n * 10;
		int in = (int)Math.round(n0);
		if (in % 10 != 9) return n;
		
		// Если второй знак после запятой не 9, то округление не требуется, иначе округляем
		double n1 = n * 100;
		in = (int)Math.round(n1);
		if (in % 10 == 9) {
			return Math.round(n);
		}
		
		// Если третий знак после запятой не 9 или 8, то округление не требуется, иначе округляем
		double n2 = n * 1000;
		in = (int)Math.round(n2);
		if (in % 10 == 9 || in % 10 == 8) {
			return Math.round(n);
		}
		
		return n;
	}
}