public class Homework8Task4b {
    static public void main(String[] args) {
        int n = 0;
        int[] array = {11, 2, 9, 3, 0, 4, 5};
        {
            for (int j = 0; j < array.length - 1; j++)
                for (int i = 0; i < array.length - 1 -  n; i++) {
                    if (array[i] < array[i + 1]) {
                        int s = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = s;
                    }
                }
            n++;
                for (int x: array) {
                    System.out.print(x);
                }
            }
        }

}






