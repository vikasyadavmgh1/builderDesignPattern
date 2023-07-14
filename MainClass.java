public class MainClass {

    public static void main(String[] args) {
        Student a = (new Student.StudentBuilder()).setAge(10).setFirstName("vikas").setLastName("yadav").buildStudent();
        System.out.println("yes");
    }
}
