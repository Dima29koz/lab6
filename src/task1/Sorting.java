package task1;

public class Sorting {
    public static void selectionSort (Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
    public static void insertionSort(Comparable[] array){
        for (int left = 0; left < array.length; left++) {
            Comparable value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (array[i].compareTo(value)>0) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
}
