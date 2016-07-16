import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by goodfeel on 16. 7. 16..
 * streamAPI 리뷰
 */
public class StreamApiEx {

    private static final int MIN_NUMBER = 5;

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sumIterator(numbers));

        System.out.println(sumStream(numbers));

        System.out.println(IntStream.iterate(1, i -> i+1).limit(7).filter(i->i>MIN_NUMBER).mapToLong(i->i).sum());
    }

    // 5보다 큰 수의 합 old
    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > MIN_NUMBER) {
                sum += num;
            }
        }
        return sum;
    }

    // 5보다 큰 수의 합 stream
    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > MIN_NUMBER).mapToInt(i -> i).sum();
    }

}
