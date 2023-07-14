
public class Student {
    private int age;
    private String firstName;
    private String lastName;
    private Student(StudentBuilder sb) {
        this.age = sb.age;
        this.firstName = sb.firstName;
        this.lastName = sb.lastName;
    }
    public static class StudentBuilder {
        private int age;
        private String firstName;
        private String lastName;
        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public StudentBuilder() {
			this.firstName = firstName;
			this.lastName = lastName;
		}
        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Student buildStudent() {
            return new Student(this);
        }
    }   

}