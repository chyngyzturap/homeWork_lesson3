import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean negativeNumber = false;
        double sumOfPositive = 0;
        int amount = 0;
        double average;


        double[] arr = {0.1, 0.3, 1.2, 4.2, 7.3, 9.2, -7.7, -1.1, -3.2, -5.5, -3.3, 7.3, 6.6, 1.2, -2.1};
        for (double doubles : arr) {
            if (!negativeNumber && doubles < 0) {
                negativeNumber = true;
                continue;
            }
            if (negativeNumber && doubles > 0) {
                sumOfPositive += doubles;
                amount++;
            }
        }
        average = sumOfPositive / amount;
        System.out.println("Ответ: " + average);


        double[] array = {0.1, 0.3, 1.2, 4.2, 7.3, 9.2, -7.7, -1.1, -3.2, -5.5, -3.3, 7.3, 6.6, 1.2, -2.1};
        for (int i = 0; i < array.length; i++) {
            double minimum = array[i];
            var x = i - 1;
            while (x >= 0 && minimum < array[x]) {
                array[x + 1] = array[x];
                x--;
                array[x - 1] = minimum;
            }
            System.out.println(Arrays.toString(array));
        }


    }
}
