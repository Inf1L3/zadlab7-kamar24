package pl.edu.ur.oopl7.Zadanie;
/**
 *
 * @author LKusta
 */
import java.util.Random;

public class P3d extends P2d{
    private int z;

    public P3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public P3d() {

    }

    public int getZ() {
        return z;
    }

    public P3d randPoint()
    {
        Random rand = new Random();
        P3d p3d = new P3d(rand.nextInt(21)-10,rand.nextInt(21)-10,rand.nextInt(21)-10);
        return p3d;
    }

    @Override
    public String toString() {
        return super.toString()+",z("+z+")";
    }
}