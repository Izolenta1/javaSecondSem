package prac2;

import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

public class Prac2Test {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(23, "Jack", "Horner", LocalDate.of(2002, Month.FEBRUARY, 11), 67));
        humanList.add(new Human(45, "Anna", "Abelina", LocalDate.of(1965, Month.MARCH, 13), 56));
        humanList.add(new Human(64, "Nick", "Nickolas", LocalDate.of(1946, Month.APRIL, 23), 78));
        humanList.add(new Human(13, "Ferra", "Smith", LocalDate.of(2010, Month.JANUARY, 7), 25));

        Stream<Human> humanStream = humanList.stream();
        List<Integer> weightList = new ArrayList<>();
        weightList = humanStream.map(person -> person.getWeight()).collect(Collectors.toList());

        humanStream = humanList.stream();
        humanStream.filter(person -> person.getBirthDate().getYear() >= 2000)
                   .peek(person -> person.gainWeight())
                   .sorted(Comparator.comparing(person -> person.getWeight(), Comparator.reverseOrder()))
                   .forEach(person -> person.print());

        Stream<Integer> weightStream = weightList.stream();
        Optional<Integer> sum = weightStream.reduce((a, b) -> a + b);
        System.out.println(sum.get());
    }
}
