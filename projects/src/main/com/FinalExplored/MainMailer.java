package main.com.FinalExplored;

import java.util.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {
    public static void main(String[] args) {
        String[] names ={"Ann Jones", "Ann Jones Ph.D.", "Bob Jones M.D.", "Carol Jones",
        "Ed Green Ph.D.", "Ed Black"};
        List<StringBuilder> population= getNames(names);
        Map<StringBuilder, Integer> counts = new TreeMap<>();
        population.forEach(s->{
            counts.merge(s,1,Integer::sum);
        });
        System.out.println(counts);
        List<StringBuilder> cleanNames =standardizedNames(population);
        System.out.println(cleanNames);

        counts.forEach((k,v) -> System.out.println(k +" : "+v));

        System.out.println("-".repeat(30));
        counts.keySet().forEach(k-> System.out.println(k+" : "+counts.get(k)));
    }

    private static List<StringBuilder> getNames(String[] names){
        List<StringBuilder> list = new ArrayList<>();
        int index=3;
        for (String name: names) {
            for (int i = 0; i < index; i++) {
                list.add(new StringBuilder(name));
            }
            index++;
        }
        return list;
    }

    private static List<StringBuilder> standardizedNames(List<StringBuilder> list){
        List<StringBuilder> newList = new ArrayList<>();
        for (var name: list) {
            for(String suffix:new String[]{"Ph.D", "M.D."}){
                int startIndex=-1;
                if((startIndex=name.indexOf(suffix))>-1){
                    name.replace(startIndex-1,startIndex+suffix.length(),"");
                }
            }
            newList.add(name);
        }
        return newList;
    }
}
