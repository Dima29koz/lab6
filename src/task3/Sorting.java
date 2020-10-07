package task3;

import java.util.Arrays;

public class Sorting {
    public static Comparable[] mergeSort (Student[] array1, Student[] array2) {
        Comparable[] students = new Student[array1.length + array2.length];
        int i = 0;
        for (;i < array1.length;i++)
            students[i] = array1[i];
        for (int j=0;j < array1.length;j++)
            students[i+j] = array2[j];


        Comparable[] buffer2 = new Comparable[students.length];
        students = mergesortInner(students, buffer2, 0, students.length);
        return students;
    }
    public static Comparable[] mergesortInner(Comparable[] buffer1, Comparable[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        Comparable[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Comparable[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Comparable[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].compareTo(sorted2[index2]) < 0
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

}
