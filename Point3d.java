public class Point3d {
	
	private double x;
	private double y;
	private double z;
	
	public Point3d () {
		this (0, 0, 0);
	}
	
	public Point3d (double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3d (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	public boolean equals(Point3d p) {
		double x, y, z;
		x = p.getX();
		y = p.getY();
		z = p.getZ();
		if (this.x == x & this.y == y & this.z == z) return true;
		else return false;
	}
	
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
	}
	
	public static double roundTo2Symbols(double n) {
		n *= 100;
		int in = (int)Math.round(n);
		n = (double) in / 100;
		return n;
	}
	
}