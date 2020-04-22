// Основной класс

public class Point2d {
	
	protected double x;
	protected double y;
	
	// Конструктор по умолчанию
	public Point2d () {
		this (0, 0);
	}
	
	// Конструктор инициализации точек типа double
	public Point2d (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Конструктор инициализации точек типа int
	public Point2d (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Сравнение разных объектов класса Point3d на равенство координат
	public boolean equals(Object obj) {
		Point2d p;
		if (obj instanceof Point2d) {
			p = (Point2d) obj;
		}
		else {
			return false;
		}
		double x, y;
		x = p.getX();
		y = p.getY();
		if (this.x == x & this.y == y) return true;
		else return false;
	}
	
	// Получение координаты x
	public double getX() {
		return this.x;
	}
	
	// Получение координаты y
	public double getY() {
		return this.y;
	}
	
	// Установка координаты x
	public void setX(double x) {
		this.x = x;
	}
	
	// Установка координаты y
	public void setY(double y) {
		this.y = y;
	}
	
	// Рассчёт расстояния между точками в пространстве
	public double distanceTo(Point2d p) {
		double x, y, z;
		x = p.getX();
		y = p.getY();
		double diffXpow2 = Math.pow(x - this.x, 2);
		double diffYpow2 = Math.pow(y - this.y, 2);
		double distance = Math.pow(diffXpow2 + diffYpow2, 0.5);
		return Point3d.roundTo2Symbols(distance);
		//return distance;
	}
	
}