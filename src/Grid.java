/**
 * Created by babosamo on 2016. 7. 11..
 */
public class Grid {

    public final static int MaxPosition = 10;

    int pointX = MaxPosition;
    int pointY = MaxPosition;

    public void step(int u, int v){
        pointX = Math.min(pointX, u);
        pointY = Math.min(pointY, v);
        System.out.println("step u: " + u + ", v: " + v);
    }

    public int getCount(){
        return pointX * pointY;
    }
}
