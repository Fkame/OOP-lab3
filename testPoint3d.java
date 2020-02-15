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
		
		// Set methods
		x = -1;
		y = -2;
		z = -3.1;
		p.setX(x);
		p.setY(y);
		p.setZ(z);
		x1 = p.getX();
		y1 = p.getY();
		z1 = p.getZ();
		testPoint3d.checkingPoint3d(x, y, z, x1, y1, z1, "Point3d setter");
		
		// Equals testing
		p = new Point3d(0, 1, 2);
		Point3d p1 = new Point3d(0.0, 1.1, 2.2);
		Point3d p2 = new Point3d(0.0, 1.0, 2.0);
		if (!p.equals(p1) & p.equals(p2) & !p1.equals(p2) & p2.equals(p)) {
			System.out.println ("Point3d.equals success");
		} else {
			System.out.println ("Point3d.equals failed");
		}
		
		// roundTo2Symbols testing
		double rezult;
		double num = 2.1234567;
		double num2 = 3.0;
		double num3 = 4.1;
		System.out.println("test Point3d.roundTo2Symbols(): ");
		System.out.println("\t2.1234567 = " + Point3d.roundTo2Symbols(num));
		System.out.println("\t3.0 = " + Point3d.roundTo2Symbols(num2));
		System.out.println("\t4.1 = " + Point3d.roundTo2Symbols(num3));
		
		// Point3d.distanceTo() testing
		System.out.println("test Point3d.distanceTo(): ");
		Point3d point1 = new Point3d(0, -3, 3);
		Point3d point2 = new Point3d(3, 1, 3);
		double trueDistance = 5.0;
		double distance = point1.distanceTo(point2);
		System.out.println("\tDistance = " + distance + ", true answer = " + trueDistance);
		if (distance == trueDistance) System.out.println ("Point3d.distanceTo() success");
		else System.out.println ("Point3d.distanceTo() failed");
		
		
	}
	
	private static void checkingPoint3d(double x, double y, double z, double x1, double y1, double z1, String testMethod) {
		if (x != x1 || y != y1 || z != z1) {
			System.out.println(testMethod + " failed");
		} else {
			System.out.println(testMethod + " success");
		}
	}
	
}