package chapter4.example3.comparable;

import java.util.Arrays;

class Student implements Comparable<Student> {

    String id;
    String name;
    Double cgpa;

    public Student(String id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

}

public class ComparableTest {

    public static void main(String[] args) {

        Student[] students = {new Student("cs011", "Lennon", 3.1),
            new Student("cs021", "McCartney", 3.4),
            new Student("cs012", "Harrison", 2.7),
            new Student("cs022", "Starr", 3.7)};
        
        System.out.println("Before Sorting");
        System.out.println(Arrays.asList(students));
        
        Arrays.sort(students);
        System.out.println("After Sorting");
        System.out.println(Arrays.asList(students));
    }

}
