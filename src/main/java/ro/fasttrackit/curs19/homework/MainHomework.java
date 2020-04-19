package ro.fasttrackit.curs19.homework;

import java.util.List;

public class MainHomework {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ana", "Blandiana", 70, "Timisoara"),
                new Person("Mircea", "Eliade", 78, "Bucharest"),
                new Person("Rafael", "Coconut", 22, "Bucharest"),
                new Person("Mircea", "Radu", 42, "Bucharest"),
                new Person("Ecaterina", "Teodoroiu", 17, "Timisoara"),
                new Person("Serban", "Popescu", 33, "Oradea"),
                new Person("Albert", "Einstein", 63, "Oradea"),
                new Person("Bogdan", "Stelea", 52, "Bucharest")
        );

        PersonService personService = new PersonService(persons);

        System.out.println("All persons' names: " + personService.getNames());
        System.out.println();
        System.out.println("All major persons: " + personService.getMajor());
        System.out.println();
        System.out.println("All persons from Oradea: " + personService.getCity());
        System.out.println();
        System.out.println("All persons from Oradea OR Bucharest: " + personService.getAnyOfTwoCities());
        System.out.println();
        System.out.println("Capitalized firstnames: " + personService.getCapitalizedFirstNames());
        System.out.println();
        System.out.println("Firstnames and first letter in lastnames: " + personService.getSpecialNames());
        System.out.println();
        System.out.println("Persons with ages between 18 and 60: " + personService.getAgesBetween());
        System.out.println();
        System.out.println("Persons with first name starting with A: " + personService.getFirstNamesWithA());
        System.out.println();
        System.out.println("List first names UNIQUELY: " + personService.getUniquely());
        System.out.println();
        System.out.println("Sort the persons by first name: " + personService.sortByFirstname());
        System.out.println();
        System.out.println("Sort the persons by last name: " + personService.sortByLastname());
        System.out.println();
        System.out.println("Sort the persons by firstname, lastname and then age: " + personService.sortByEverything());

    }
}