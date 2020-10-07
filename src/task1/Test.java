package task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] students;
        students = new Student[3];
        students[0]  = new Student("name1", 21);
        students[1] = new Student("name2", 11);
        students[2] = new Student("name3", 9);
        System.out.println("input Data:");
        for(Student student : students){
            System.out.println(student);

        }
        //Sorting.selectionSort(students);
        Sorting.insertionSort(students);

        System.out.println("sorted Data: (by 'id')");
        for(Student student : students)
            System.out.println(student);
    }
}
