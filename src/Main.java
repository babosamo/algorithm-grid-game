import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int n = (int) (Math.random() * 10);

        Grid grid = new Grid();
        for(int i = 0; i < n ; i++){
            int x = (int) (Math.random() * (Grid.MaxPosition -1 ) + 1);
            int y = (int) (Math.random() * (Grid.MaxPosition -1 ) + 1);
            grid.step(x, y);
        }

        System.out.println("--- result : " + grid.getCount() + "-------");
    }



}
