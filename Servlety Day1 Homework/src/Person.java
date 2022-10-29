public class Person {
    public String firstName;
    private String lastName;
    public Integer age;
    private String city;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public Person(String _firstName, String _lastName, Integer _age, String _city) {
        firstName = _firstName;
        lastName = _lastName;
        age = _age;
        city = _city;
    }

}
