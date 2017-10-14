package chapter4.example3.comparable;

import java.util.Arrays;
import java.util.Comparator;

class CPGAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.cgpa.compareTo(o2.cgpa);
    }
    
}

public class ComparatorTest {

    public static void main(String[] args) {

        Student[] students = {new Student("cs011", "Lennon", 3.1),
            new Student("cs021", "McCartney", 3.4),
            new Student("cs012", "Harrison", 2.7),
            new Student("cs022", "Starr", 3.7)};
        
        System.out.println("Before Sorting");
        System.out.println(Arrays.asList(students));
        
        Arrays.sort(students, new CPGAComparator());
        System.out.println("After Sorting");
        System.out.println(Arrays.asList(students));
    }
    
}
