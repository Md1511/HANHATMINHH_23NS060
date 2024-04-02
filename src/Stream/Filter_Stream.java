package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Stream {
    public static void main(String[] args) {

        //Lọc các số chẵn từ một List các số nguyên
        List<Integer> Num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNum = Num.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);
    }
}
