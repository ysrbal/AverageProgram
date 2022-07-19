import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        double [] arr = {13,26,51,42,7};
        double result;
        double total = 0;
        for (double i : arr) {
            total += 1 / i;
        }
        result = arr.length / total;
        System.out.println("Harmonic Average : " + result);
    }
}