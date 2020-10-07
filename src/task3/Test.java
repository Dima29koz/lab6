package task3;

public class Test {
    public static void main(String[] args) {
        Student[] students1;
        students1 = new Student[3];
        students1[0]  = new Student("name1", 3);
        students1[1] = new Student("name2", 2);
        students1[2] = new Student("name3", 1);
        Student[] students2;
        students2 = new Student[3];
        students2[0]  = new Student("name11", 7);
        students2[1] = new Student("name22", 6);
        students2[2] = new Student("name33", 5);
        System.out.println("input Data:");
        for(Student student : students1)
            System.out.println(student);
        for(Student student : students2)
            System.out.println(student);

        Comparable[] students = Sorting.mergeSort(students1, students2);

        System.out.println("sorted Data: (by 'id')");
        for(Comparable student : students)
            System.out.println(student);

    }
}
