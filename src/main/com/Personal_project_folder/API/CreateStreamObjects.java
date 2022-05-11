package main.com.Personal_project_folder.API;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CreateStreamObjects {

    public static void main(String[] args) {
        //Create a stream
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        //Create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        //Different way of writing but getting the same result as above
        List<String> list1 = Arrays.asList("JAVA","J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list1.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list1);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        String[] strArray = {"a","b","c","d"};
        Stream<String>arrayStream = Arrays.stream(strArray);
        arrayStream.forEach(System.out::println);
    }
}
