package ro.fasttrackit.curs19;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static java.util.Comparator.comparingInt;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class MainStream {
    public static void main(String[] args) {
        streamOnNames();
    }

    public static void streamOnNames() {
        List<String> names = List.of("Dragos", "Darius", "Ana", "Marius", "Tudor", "Carmen", "Catherine");
        List<String> upperNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(toList());

        System.out.println(upperNames);

        System.out.println(names.stream()
                .filter(name -> name.length() > 3)
                .filter(name -> name.startsWith("D"))
                .map(String::toUpperCase)
                .map(e -> "- " + e)
                .collect(toList()));

        Set<String> result = names.stream()
                .filter(name -> nameIsFemale(name))
                .map(name -> "* " + name + " *")
                .collect(toSet());

        System.out.println(result);

        System.out.println(names.stream()
                .sorted()
                .collect(toList()));

        System.out.println(names.stream()
                .sorted(reverseOrder())
                .collect(toList()));

        System.out.println(names.stream()
                .sorted(comparingInt(String::length))
                .collect(toList()));

        System.out.println(names.stream()
                .sorted(comparingInt(String::length).thenComparing(s -> s))
                .collect(toList()));

        System.out.println(names.stream()
                .sorted(Comparator.comparing(s -> s.charAt(s.length() - 1)))
                .collect(toList()));
    }

    private static boolean nameIsFemale(String name) {
        return name.endsWith("a") || name.endsWith("n") || name.endsWith("e");
    }
}
