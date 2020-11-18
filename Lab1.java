public class Lab1 {
	
	public static void main(String[] args) {
		if(args.length == 9){
			Point3d p1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			Point3d p2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
			Point3d p3 = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));
			
			if(p1.equals(p2) || p1.equals(p3) || p2.equals(p3))
			{
				System.out.println("You've input 2 same points");
			}
			else
			{
				System.out.println("Triangle's area = ");
				System.out.println(Lab1.computeArea(p1, p2, p3));
			}
		}
		else
		{
			System.out.println("Input coords of 3 points");
		}
	}
	
	static double computeArea (Point3d p1, Point3d p2, Point3d p3) {
		double a, b, c, p, area;
		a = p1.distanceTo(p2);
		b = p1.distanceTo(p3);
		c = p2.distanceTo(p3);
		p = (a + b + c)/2;
		area = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		return area;
	}
}