import java.util.Arrays;
import java.util.Collections;
    public class Homework8Task4c {
        public static void main(String[] args) {
            Integer[] arr = {11, 2, 9, 3, 0, 4, 5};

            System.out.println("Массив до сортировки: " + Arrays.toString(arr));

            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("Массив после сортировки: " + Arrays.toString(arr));
        }
    }
