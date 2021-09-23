package Question2And3;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Student {
    String name;
    int semester;
    int age;
    String gender;

    public Student(String name, int semester, int age, String gender) {
        this.name = name;
        this.semester=semester;
        this.age = age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student("Jay", 3, 20, "male"));
        studentlist.add(new Student("Summit", 3, 21, "male"));
        studentlist.add(new Student("Dharma", 2, 19, "male"));
        studentlist.add(new Student("juno", 3, 18, "male"));
        studentlist.add(new Student("Ajay", 5, 22, "male"));
        //Fetching student names as List.
        List<String> names = studentlist.stream()
                .map(e -> e.name)
                .collect(Collectors.toList());
        System.out.println(names);

        //Fetching students whose name starts with j or J and semester is 3.
        List<Student> info = studentlist.stream()
                .filter(e -> e.name.toLowerCase().startsWith("j") && e.semester == 3)
                .collect(Collectors.toList());
        System.out.println(info);
    }
}
