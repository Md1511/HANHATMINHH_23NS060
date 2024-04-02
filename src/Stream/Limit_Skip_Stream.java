package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_Skip_Stream {
    public static void main(String[] args) {
        List<Integer> Num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> gioiHanNum = Num.stream().limit(5).collect(Collectors.toList());
        System.out.println(gioiHanNum);

        //In ra từ 1 - > 5

        //---------------------------------------

        List<Integer> keTiepNum = Num.stream().skip(5).collect(Collectors.toList());
        System.out.println(keTiepNum);

        //In ra từ 6 - > 10

    }
}
