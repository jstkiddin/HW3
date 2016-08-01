/**
 * Created by Makoto on 11.06.2016.
 */
public class SumOf {
    int c;
    int l =1;
    int kill = 0;
    public SumOf(){

    }

    /*public int fac(int n, int l){
        if(n<1){ return l;}
        else{
            l*=n;
        }

        return fac(n-1,l);

    }*/

    public int task7(int x, int y){ //сумма чисел от 1 до n
        if (x==0){
            return y;
        }
        y+=x;
        return y = task7(x-1, y);
    }

    public void task1 (int x){ //сумма цифер числа
        int c;
        int sum = 0;
        do{
            c = x%10;
            sum+=c;
            x /= 10;
        } while (x!=0);
        System.out.println("Сумма цифр вашего числа: "+sum);
       // System.out.println("_________________________________________");
    }



   /*public int task3 (int k) { //попытка затащить задание со счастливым билетом
      if(k > 28){return kill;}
        else{
            l = 1;
            if(k <=9){

                int lol = fac(k,l);
                int lol1 = fac(k+2,l);
                c = lol1/(lol*2);
            }
            else{
                int l2 = fac(k,l);
                int l1 = fac(k+2,l);
                int lol = fac(k-12,l);
                int lol1 = fac(k-10,l);
                c =(l1/l2*2)-3*(lol1/lol*2);

            }
            kill += c*c;
            task3(k+1);
        }
        return kill;
    }
   }*/
}