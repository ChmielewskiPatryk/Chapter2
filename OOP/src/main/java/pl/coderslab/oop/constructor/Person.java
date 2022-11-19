    public class Person{
        private String name;
        private String surname;
        private int age;
        private char genger;
        private String fullName;

        public Person(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        public void setFullName(String name, String surname ){
            this.fullName = this.name + " " + this.surname;
        }
        public String getFullName() {
            return this.fullName;
        }
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Person(String name, String surname, int age, char genger){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.genger = genger;

        }


    }
