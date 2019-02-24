import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

    public static void main(String[] args) {


        Double a,b,c, delta, x1, x2;
        String brakmiejsca;

        Scanner scan = new Scanner(System.in);


        System.out.print("Podaj liczbę znajdującą się przy niewiadomej z kwadrate ");
        a = scan.nextDouble();
        System.out.print("Podaj liczbę znajdującą się przy niewiadomej ");
        b = scan.nextDouble();
        System.out.print("Podaj liczbę znajdującą się bez parametru ");
        c = scan.nextDouble();

        System.out.println();

        delta = przeliczDelte(a,b,c);
        miejsca_zer(delta,a,b);




    }

    public static double przeliczDelte(double a, double b, double c)
    {
        return (b*b - (4*a*c));
    }

    public static void miejsca_zer(double delta, double a, double b)
    {
        if(delta < 0) System.out.println("Brak miejsc zerowych");
        else if(delta > 0) {
            double x1,x2;
            x1 = (-b + sqrt(delta))/2*a;
            x2 = (-b - sqrt(delta))/2*a;
            System.out.format("Pierwsze meijsce zerowe %.2f, A drugie miejsce zerowe %.2f", x1,x2);
        }
        else System.out.println(-b/2*a);

    }



}
