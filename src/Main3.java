import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Main3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int licz_uz;
        boolean koniec = false;
        int min = 0, max = 1000, temp = 0;
        int licznik = 1;



        System.out.print("Podaj liczbę z przediał 0 -1000 : ");
        licz_uz = scan.nextInt();

        while(!koniec)
        {
           temp = losuj(min,max);
           System.out.println("Próba nr " + licznik + ",czy jest to " + temp);
           licznik ++;

           if(temp < licz_uz) min = temp;
           else if(temp > licz_uz) max = temp;
           else koniec = true;
        }

        System.out.println("Znalazłem Twoja liczbę w " + (licznik -1) + " próbach, jest to : " + temp );


    }

    public static int losuj(int min, int max){


        Random los = new Random();
        //return los.nextInt((max - min) + 1)+ min;
        return los.nextInt((max - min) )+ min;
    }

}
