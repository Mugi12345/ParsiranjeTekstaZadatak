public class Person {
    String name;
    String surname;
    String city;

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;

    }
    String getInfo(){
        return  name + " " + surname + " " + city;
    }
}
