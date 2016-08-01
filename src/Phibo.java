/**
 * Created by Makoto on 11.06.2016.
 */
public class Phibo {
    int x = 1;
    public Phibo() {
    }

    public void phiboNumbers(){
        System.out.println("_____TASK 2____");
        int prev = 0;
        System.out.print(x);
        for (int i = 2; i<7; ++i){
            prev += x;
            x += prev;
            System.out.print(" "+prev+" "+x);
      }
        System.out.println();
    }
}
