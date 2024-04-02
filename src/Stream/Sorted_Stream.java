package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Stream {
    public static void main(String[] args) {
        //Sắp xê một chuỗi theo thứ Alphabet

        List<String> traiCay = Arrays.asList("Apple","Orange", "Banana", "Mango");

        List<String> sortedtraiCay = traiCay.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedtraiCay);
    }
}
