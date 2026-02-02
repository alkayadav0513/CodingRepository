package beginnersClas;
public class primeNumber2 {
    public static void main(String[] args) {
        int start = 1, end = 100; // Range

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int n = start; n <= end; n++) {
            if (n <= 1) continue; // Skip 0 and 1

            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
