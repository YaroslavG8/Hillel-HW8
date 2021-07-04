import java.util.Arrays;

public class Homework8Task2b {
    static public void main(String[] args) {
        int[] array1 = {15, 11, 5, 9, 6, 44, 18};
        int sum = Arrays.stream(array1).sum();
        System.out.println("Сумма всех элементов: " + sum);

    }
}