import java.util.Random;

public class TwoD {
    int l = 8;
    int l1 = 5;

    int [][] mass = new int [l][l1];
    int [][] mass_2 = new int [l-1][l1-1];
    Random r = new Random();
    TwoD(){

    }

    public void print(int l,int l1){
        for(int i = 0; i < l; ++i){
            for(int j = 0; j<l1; ++j){
               System.out.print( mass[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void doSmt(){
        System.out.println("_____TASK 5____"); //array 8x5
        for(int i = 0; i < 8; ++i){
            for(int j = 0; j<5; ++j){
              mass[i][j] = 10+r.nextInt(90); //random numbers
            }
        }

        print(l,l1);
    }

    public void doSmt2(){
        System.out.println("_____TASK 6____"); //array [-5;5]
        for(int i = 0; i < l-1; ++i){
            for(int j = 0; j<l1-1; ++j){
                mass[i][j] = r.nextInt(11)-5;
            }
        }

        print(l-1,l1-1);
        lol();
    }

    public void lol(){ //вычисляем строку с наибольшим произведением чисел "TASK 5"
        int f1 = 0;
        int x = 0;
        //int y = 0;
        for(int i = 0; i < l-1; ++i){
            int ks = 1;
            for(int j = 0; j<l1-1; ++j){
             //dopilit' proizvidenie;
                    ks *= mass[i][j];
                }
                if(Math.abs(ks) > f1){
                    f1 = Math.abs(ks);
                    x = i;
            }}
        System.out.println("Строка с наибольшим произведением ее чисел "+(x+1));
    }
}