package pl.edu.ur.oopl7.Zadanie;
/**
 *
 * @author LKusta
 */
import java.util.Random;

public class P2d {
    private int x;
    private int y;

    public P2d(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public P2d() {

    }

    public P2d randomPoints()
    {
        Random rand = new Random();
        P2d p = new P2d(rand.nextInt(21)-10,rand.nextInt(21)-10);
        return p;
    }
    @Override
    public String toString()
    {
        return "x("+x+"),y("+y+")";
    }
}