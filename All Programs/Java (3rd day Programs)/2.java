class Abhi
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2));
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z);
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   Abhi a = new Abhi();
	   a.area(8);
	   a.area(25,45);
	   a.area(8);
        }
}
