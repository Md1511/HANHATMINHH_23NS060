package Stream;

import java.util.Arrays;
import java.util.List;

public class forEach_Stream {
    public static void main(String[] args) {
        //In cac phần tử trog danh sách chuỗi
        List<String> traiCay = Arrays.asList("Apple", "Banana", "Orange");

        traiCay.stream().forEach(System.out::println);
    }
}
