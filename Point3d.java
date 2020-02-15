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
}