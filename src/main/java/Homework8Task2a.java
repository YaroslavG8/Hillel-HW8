import java.util.stream.*;


public class Homework8Task2a {
    static public void main(String[] args) {
        int[] array1 = {15, 11, 5, 9, 6, 44, 18};
        double average = IntStream.of(array1).average().getAsDouble();
        System.out.println("Среднее арифметическое: " + average);
    }
//а) среднее арифметическое
    }

