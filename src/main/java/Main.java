public class Main {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";

        Person[] persons = new Person[3];

        String[] textArray = text.split(" ");

        for (int i = 0; i < textArray.length; i++) {
            System.out.println(textArray[i]);
        }

        for (int i = 0; i < textArray.length; i++) {
            String firstName = textArray[i].split("\\.")[0];
            String lastName = textArray[i].split("[./]")[1];
            String city = textArray[i].split("/")[1];
            Person person = new Person(firstName,lastName,city);

            persons[i] = person;

        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getInfo());
        }
    }
}
