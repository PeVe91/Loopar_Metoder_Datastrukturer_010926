package org.example;
/*
Skapa ett record som representerar en person
med fälten namn, ålder och stad. Skriv ett program
som skapar tre personer och skriver ut deras information.
*/
public class Uppg8 {
    static void main() {

    Person person1 = new Person("Per", 34, "Katrineholm");
    Person person2 = new Person("Charlie", 31, "Hudiksvall");
    Person person3 = new Person("Andreas", 34, "Bålsta");

    IO.println("Namn: " + person1.name() +
            ", ålder: " + person1.age() +
            ", Stad: " + person1.city());
    }


    public record Person(String name, int age, String city) {

    }
}
