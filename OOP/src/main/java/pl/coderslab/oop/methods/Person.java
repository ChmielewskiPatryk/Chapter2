public class Person {
    private String name;
    private String surname;
    private int age;
    private char gender;
    private String fullName;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setFullName(String name, String surname) {
        this.fullName = this.name + " " + this.surname;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void increaseAge() {
        this.age++;
    }
}
