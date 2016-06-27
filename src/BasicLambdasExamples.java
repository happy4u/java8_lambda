import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BasicLambdasExamples {

    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        System.out.println("Old looping");
        System.out.println("------------------------------------");
        for (String player : players) {
            System.out.print(player + "; ");
        }

        System.out.println("\n\n\nUsing lambda expression and functional operations");
        System.out.println("------------------------------------");
        players.forEach((player) -> System.out.print(player + "; "));


        System.out.println("\n\n\nUsing double colon operator in Java 8");
        System.out.println("------------------------------------");
        players.forEach(System.out::println);

        System.out.println("\n\n\n\n");
        BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
        System.out.println( "calling addition of 2 and 3 resulting: " + addition.apply( 2, 3 ) );

    }
}
