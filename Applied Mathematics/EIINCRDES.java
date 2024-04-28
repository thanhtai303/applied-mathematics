
import java.util.*;

public class EIINCRDES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        boolean checkIncrease = true;
        boolean checkDecrease = true;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] <= array[i + 1]) {
                checkDecrease = false;
            }
            if (array[i] >= array[i + 1]) {
                checkIncrease = false;
            }
        }
        if (array[n - 1] >= array[n - 2]) {
            checkDecrease = false;
        }
        if (array[n - 1] <= array[n - 2]) {
            checkIncrease = false;
        }
        if ((!checkDecrease && !checkIncrease) || (checkDecrease && checkIncrease)) {
            System.out.println("none");
        } else {
            if (checkIncrease) {
                System.out.println("increasing");
            } else {
                System.out.println("decreasing");
            }
        }
    }


}
