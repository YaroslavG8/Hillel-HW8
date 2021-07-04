public class Homework8Task3 {
    static public void main(String[] args) {
        int[] mini = {15, 11, 5, 9, 6, 44, 18};
        for (int i = 0; i < mini.length - 1; i++) {
            if(mini[i] < mini[i+1]) {
                int s = mini[i];
                mini[i + 1] = mini[i];
                mini[i] = s;
            }
        }
        System.out.println("Минимальное число: " + mini[mini.length - 1]);

    }

}
