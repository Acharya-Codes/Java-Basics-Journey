class Student {
    int mark = 0;
    static String teacher = "Praveen";
}
public class staticc{
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.teacher);
        System.out.print(s2.teacher);

    }
}
// Static is related to class and not object!!