package pl.edu.ur.oopl7.Zadanie;
/**
 *
 * @author LKusta
 */

public class Main {
    public static void main(String[] args)
    {


    P2d p1 = new P2d().randomPoints();
    P3d p2 = new P3d().randPoint();
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        P2d[] array2D = new P2d[100];
        P3d[] array3D = new P3d[100];

            for(int i=0;i<100;i++)
            {
                array2D[i] = new P2d().randomPoints();
                array3D[i] = new P3d().randPoint();
            }

            for(int i=0;i<100;i++)
            {
                if(array2D[i].getX()==array3D[i].getX() && array2D[i].getY()==array3D[i].getY())
                {
                    System.out.println("Punkt 2d - "+array2D[i].toString()+" ,Punkt 3d -"+array3D[i].toString());
                }
            }
    }


}