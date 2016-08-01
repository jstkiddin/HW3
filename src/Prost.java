import java.util.ArrayList;

/**
 * Created by Makoto on 15.06.2016.
 */
public class Prost {
    int i = 2;
    ArrayList<Integer> mass = new ArrayList<Integer>();
    Prost(){

    }

    public void getMyNumbers(int x){
        if(i > x){return;}
            int count = 0;
            for (int j = 0; j<mass.size(); ++j){
            if(i%mass.get(j) == 0){++count;}}
            if (count == 0) {
                System.out.print(i+" ");
                mass.add(i);
            }
            ++i;
            getMyNumbers(x);
        }

    }