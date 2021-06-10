

class Overload 
{
    double volume(int  r, int  h) 
    {
        return (3.1416*0.33*h*r*r);
    }

    double volume(float l) 
    {
        return (l * l * l);
    }

    double volume(double a, double b)
   {
        return (3.1416*a*a*b);
 
   }
}


public class Overloading 

	{
    public static void main(String args[])

   {
        Overload overload = new Overload();

         double cone = overload.volume(1, 2);
        System.out.println("Volume of cone is " + cone);

        System.out.println("");

        double cube = overload.volume(2);
        System.out.println("Volume of cube is " + cube);

        System.out.println("");

        double cylinder = overload.volume(2.00, 1.00);
        System.out.println("Volume of cylinder is " + cylinder);

    }
}