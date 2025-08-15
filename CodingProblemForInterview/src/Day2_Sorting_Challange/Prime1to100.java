package Day2_Sorting_Challange;
public class Prime1to100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
