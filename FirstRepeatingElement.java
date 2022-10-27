import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElement {

    public static int firstRepeated(int[] arr, int n) {
        int min = -1;

        HashSet<Integer> hs = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {

            if (hs.contains(arr[i]))

                min = i;

            else

                hs.add(arr[i]);

        }

        if (min != -1) {

            return min + 1;

        }

        else

            return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeated(arr,arr.length));
    }
}
