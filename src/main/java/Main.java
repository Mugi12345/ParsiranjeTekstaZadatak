public class Main {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        int personsCounter = 0;

        Person[] persons = new Person[3];

        String[] data = text.split("[./ ]");

        for (int i = 0; i < data.length; i += 3) {

            Person person = new Person(data[i], data[i + 1], data[i + 2]);
            persons[personsCounter] = person;
            personsCounter++;
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getInfo());
        }
    }
}
