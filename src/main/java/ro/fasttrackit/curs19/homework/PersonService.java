package ro.fasttrackit.curs19.homework;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PersonService {
    private final List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> getNames() {
        return persons.stream()
                .map(Person::getNames)
                .collect(toList());
    }

    public List<Person> getMajor() {
        return persons.stream()
                .filter(p -> p.getAge() >= 18)
                .collect(toList());
    }

    public List<Person> getCity() {
        return persons.stream()
                .filter(p -> p.getCity().equalsIgnoreCase("Oradea"))
                .collect(toList());
    }

    public List<Person> getAnyOfTwoCities() {
        return persons.stream()
                .filter(p -> p.getCity().equalsIgnoreCase("Oradea") || p.getCity().equalsIgnoreCase("Bucharest"))
                .collect(toList());
    }

    public List<String> getCapitalizedFirstNames() {
        return persons.stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public List<String> getSpecialNames() {
        return persons.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName().substring(0, 1) + ".")
                .collect(toList());
    }

    public List<Person> getAgesBetween() {
        return persons.stream()
                .filter(p -> p.getAge() > 18 && p.getAge() < 60)
                .collect(toList());
    }

    public List<Person> getFirstNamesWithA() {
        return persons.stream()
                .filter(p -> p.getNames().startsWith("A"))
                .collect(toList());
    }

    // DE REFACUT
    public List<String> getUniquely() {
        return persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(toList());
    }

    public List<Person> sortByFirstname() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }

    public List<Person> sortByLastname() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(toList());
    }

    public List<Person> sortByEverything() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .sorted(Comparator.comparing(Person::getLastName))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }
}
