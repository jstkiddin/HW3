import java.util.Scanner;

/**
 * Created by Makoto on 11.06.2016.
 */
public class Main {

    public static void countSme(){
        System.out.println("_____TASK 4____");
        int x = 0;
        int count = 0;
        int y = 0;
        do {
            if (y > 5) {
                y = 0;
                ++x;
            } else {
                System.out.print(x +""+ y + ":" + y +""+ x + " ");
                ++y;
                ++count;
            }
        } while ((x!=2)||(y!=4));
        System.out.println();
        System.out.println(count+" раз");
    }

    public static void calc(){ //тщетно бытие. факториалы не получились. пришлось пилить Счастливые билеты так
        int sum = 0;
        for(int a1 = 0; a1 <= 9; ++a1){
            for(int a2 = 0; a2 <= 9; ++a2){
                for(int a3 = 0; a3 <= 9; ++a3){
                    for(int a4 = 0; a4 <= 9; ++a4){
                        for(int a5 = 0; a5 <= 9; ++a5){
                            for(int a6 = 0; a6 <= 9; ++a6){
                                if((a1+a2+a3)==(a4+a5+a6)){
                                    ++sum;}
                            }
                        }
                    }
                }

            }
        }
        System.out.println(sum-1);
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        TwoD td = new TwoD();
        SumOf so = new SumOf();
        Phibo ph = new Phibo();
        Prost pr = new Prost();
        int x,y;
 //taks 1
        System.out.println("_____TASK 1____");
        System.out.print("Введите число: ");
        x = sc.nextInt();
        so.task1(x);
   //task 2
        ph.phiboNumbers();
   //task 3
        System.out.println("_____TASK 3____");
       calc();
        System.out.println("//не 55252, ибо не считался билет 000 000");
   //task 4
        countSme();
   //task 5
        td.doSmt();
   //task 6
        td.doSmt2();
   //task 7
        System.out.println("_____TASK 7____");
        System.out.print("Введите число: ");
        x = sc.nextInt();
        y = 0;
        System.out.println(so.task7(x,y));
   //task 9
        System.out.println("_____TASK 9____"); //простые числа до n
        System.out.print("Введите число: ");
        x = sc.nextInt();
        pr.getMyNumbers(x);
    }
}
