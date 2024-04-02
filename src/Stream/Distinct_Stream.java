package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_Stream {
    public static void main(String[] args) {

        //Lộc các phần tử duy nhất
        List<Integer> Num = Arrays.asList(1,2,2,3,3,4,5);

        List<Integer> distinctNum = Num.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctNum);
    }
}
