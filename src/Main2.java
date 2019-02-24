import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        int max;

        lista.add(2);
        lista.add(45);
        lista.add(3);
        lista.add(6);
        lista.add(8);

        max = lista.get(0);

        //lista.forEach((p) -> (if( (Integer)p >max) max = p)


        max = lista.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println();
        System.out.println("Max ze streamu " + max);




    }




}
