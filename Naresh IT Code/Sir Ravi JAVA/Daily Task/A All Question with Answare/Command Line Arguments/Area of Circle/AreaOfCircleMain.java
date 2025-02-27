class AreaOfCircle{
	public static double area(double radious){
		final double PI=3.14;
		return PI*radious*radious;
	}
}

public class AreaOfCircleMain{
	public static void main(String []args){
		double radious=Double.parseDouble(args[0]);
		
		System.out.println("Area of circle is: "+AreaOfCircle.area(radious));	
	}
}