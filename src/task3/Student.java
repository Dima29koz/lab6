package task3;

public class Student implements Comparable<Student>{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public int compareTo(Student student){
        if (this.id == student.id) {
            return 0;
        } else if (this.id < student.id) {
            return -1;
        } else {
            return 1;
        }
    }
    public String toString(){
        return "name: " + this.name + " id: " + this.id;
    }
}
