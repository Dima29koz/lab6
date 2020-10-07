package task2;

public class Test {
    public static void main(String[] args) {
        Student[] students;
        students = new Student[4];
        students[0]  = new Student("name1", 54);
        students[1] = new Student("name2", 11);
        students[2] = new Student("name3", 9);
        students[3] = new Student("name4", 14);
        System.out.println("input Data:");
        for(Student student : students){
            System.out.println(student);

        }
        Sorting.quickSort(students, 0, students.length-1);

        System.out.println("sorted Data: (by 'mark')");
        for(Student student : students)
            System.out.println(student);
    }
}
