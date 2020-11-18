
public class Point3d extends Point2d{ 

	private double zCoord;

	public Point3d ( double x,  double y, double z) { 
		super(x, y);
		zCoord = z;
	} 
 
	public Point3d () { 
		//Вызовите конструктор с двумя параметрами и определите источник. 
		this(0, 0, 0); 
	} 

	public double getZ () { 
		return zCoord; 
	} 

	public void setZ ( double val) { 
		zCoord = val; 
	} 

	public boolean equals ( Point3d p3d) { 
		if(this.getX() == p3d.getX() && this.getY() == p3d.getY() && this.getZ() == p3d.getZ())
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
	
	public double distanceTo ( Point3d p3d){
		double distance = Math.pow(this.getX() - p3d.getX(), 2) + Math.pow(this.getY() - p3d.getY(), 2) + Math.pow(this.getZ() - p3d.getZ(), 2);
		distance = Math.sqrt(distance);
		distance *= 100;
		distance = Math.round(distance);
		distance /= 100;
		return distance;
	}
} 
