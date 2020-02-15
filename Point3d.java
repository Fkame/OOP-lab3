public class Point3d {
	
	private double x;
	private double y;
	private double z;
	
	// Конструктор по умолчанию
	public Point3d () {
		this (0, 0, 0);
	}
	
	// Конструктор инициализации точек типа double
	public Point3d (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Конструктор инициализации точек типа int
	public Point3d (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Получение координаты x
	public double getX() {
		return this.x;
	}
	
	// Получение координаты y
	public double getY() {
		return this.y;
	}
	
	// Получение координаты z
	public double getZ() {
		return this.z;
	}
	
	// Установка координаты x
	public void setX(double x) {
		this.x = x;
	}
	
	// Установка координаты y
	public void setY(double y) {
		this.y = y;
	}
	
	// Установка координаты z
	public void setZ(double z) {
		this.z = z;
	}
	
	// Сравнение разных объектов класса Point3d на равенство координат
	public boolean equals(Point3d p) {
		double x, y, z;
		x = p.getX();
		y = p.getY();
		z = p.getZ();
		if (this.x == x & this.y == y & this.z == z) return true;
		else return false;
	}
	
	// Рассчёт расстояния между точками в пространстве
	public double distanceTo(Point3d p) {
		double x, y, z;
		x = p.getX();
		y = p.getY();
		z = p.getZ();
		double diffXpow2 = Math.pow(x - this.x, 2);
		double diffYpow2 = Math.pow(y - this.y, 2);
		double diffZpow2 = Math.pow(z - this.z, 2);
		double distance = Math.pow(diffXpow2 + diffYpow2 + diffZpow2, 0.5);
		return Point3d.roundTo2Symbols(distance);
		//return distance;
	}
	
	// Округление значения типа double до 2-х знаков после запятой
	public static double roundTo2Symbols(double n) {
		n *= 100;
		int in = (int)Math.round(n);
		n = (double) in / 100;
		return n;
	}
}