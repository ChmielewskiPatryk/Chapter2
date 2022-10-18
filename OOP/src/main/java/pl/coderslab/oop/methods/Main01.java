public class Main01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Kacper");
        person.setSurname("Chmielewski");
        person.setAge(25);
        person.setGender('M');
        person.setFullName("Kacper","Chmielewski");
        System.out.println(person.getFullName());

        person.increaseAge();
        System.out.println(person.getAge());
    }
}
