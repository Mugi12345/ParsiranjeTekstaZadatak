public class Person {
    String firstName;
    String lastName;
    String city;

    public Person(String name, String surname, String city) {
        this.firstName = name;
        this.lastName = surname;
        this.city = city;

    }
    String getInfo(){
        return  firstName + " " + lastName + " " + city;
    }
}
