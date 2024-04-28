import java.util.*;

public class EIAUCTION {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int numberOfPeople = sc.nextInt();
        int[] people = new int[numberOfPeople];
        int[] dice = new int[7];
        for (int i = 0; i < numberOfPeople; i++) {
            int a = sc.nextInt();
            people[i] = a;
            dice[a]++;
        }
        int max = 0;
        int output = 0;
        for (int i = 0; i < numberOfPeople; i++) {
            if (dice[people[i]] == 1 && people[i] > max) {
                max = people[i];
                output = i;
            }
        }
        if (max == 0) {
            System.out.println("none");
        } else {
            System.out.println(output+1);
        }
    }
}
