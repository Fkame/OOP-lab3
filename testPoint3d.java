public class testPoint3d {
	
	public static void main (String[] args) {
		System.out.println("Start testing class Point3d...");
		
		double x, y, z;
		int xi, yi, zi;
		double x1, y1, z1;
		Point3d p;
		
		// Check default constructor
		x = y = z = 0;
		p = new Point3d();
		x1 = p.getX();
		y1 = p.getY();
		z1 = p.getZ();
		testPoint3d.checkingPoint3d(x, y, z, x1, y1, z1, "Point3d()");
		
		// Check constructor double
		x = y = z = 0;
		p = new Point3d(x, y, z);
		x1 = p.getX();
		y1 = p.getY();
		z1 = p.getZ();
		testPoint3d.checkingPoint3d(x, y, z, x1, y1, z1, "Point3d(0, 0, 0)");
		
		// Check cinstructor int
		x = 1;
		y = 2;
		z = 3;
		xi = (int)x;
		yi = (int)y;
		zi = (int)z;
		p = new Point3d(xi, yi, zi);
		x1 = p.getX();
		y1 = p.getY();
		z1 = p.getZ();
		testPoint3d.checkingPoint3d(x, y, z, x1, y1, z1, "Point3d(1, 2, 3)");
		
		// Check double constructor
		x = 2.5;
		y = 10.7;
		z = -1;
		p = new Point3d(x, y, z);
		x1 = p.getX();
		y1 = p.getY();
		z1 = p.getZ();
		testPoint3d.checkingPoint3d(x, y, z, x1, y1, z1, "Point3d(2.5, 10.7, -1)");
		
	}
	
	private static void checkingPoint3d(double x, double y, double z, double x1, double y1, double z1, String testMethod) {
		if (x != x1 || y != y1 || z != z1) {
			System.out.println(testMethod + " failed");
		} else {
			System.out.println(testMethod + " success");
		}
	}
	
}