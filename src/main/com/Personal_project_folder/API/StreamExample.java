package main.com.Personal_project_folder.API;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //count(), min(), and max() methods

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println("The number of elements in the Stream are: "+Stream.of(1,2,3,4,5,6,7,8,9,10).count());

        Integer min = Stream.of(1,2,3,4,5,6,7,8,9,10).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum value in the List: "+min);

        Integer max = Stream.of(1,2,3,4,5,6,7,8,9,10).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum value in the list: "+max);

    }
}
