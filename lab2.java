import java.util.Scanner;
public class Lab2p1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.println("m =");
                    int m = sc.nextInt();
                    System.out.println("n = ");
                    int n = sc.nextInt();
                    int result = divide(m, n);
                    String res = String.format("%d/%d = %d", m, n, result);
                    System.out.println(res);



                    break;
                case 3: /* add modulus() call */
                    System.out.println("m =");
                    m = sc.nextInt();
                    System.out.println("n = ");
                    n = sc.nextInt();
                    result = modulus(m, n);
                    res = String.format("%d/%d = %d", m, n, result);
                    System.out.println(res);

                    break;
                case 4: /* add countDigits() call */
                    System.out.println("n = ");
                    n = sc.nextInt();

                    if (n < 0) {
                        res = String.format("n: %d - Error input!!", n);
                    } else {
                        result = countDigits(n);
                        res = String.format("n: %d - count = %d", n, result);
                    }

                    System.out.println(res);
                    break;
                case 5: /* add position() call */
                    System.out.println("n:");
                    n = sc.nextInt();
                    System.out.println("digit:");
                    char digit = sc.next().charAt(0);
                    result = position(n, digit);
                    res = String.format("position = %d", result);
                    System.out.println(res);
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("n = ");
                    n = sc.nextInt();

                    if (n < 0) {
                        res = String.format("n: %d - Error input!!", n);
                    } else {
                        result = countDigits(n);
                        res = String.format("n: %d - count = %d", n, result);
                    }

                    System.out.println(res);
                    break;
                case 7: System.out.println("Program terminating...");
            }
        } while (choice < 7);
    }


    public static void mulTest() {
        int numberOfCorrect = 0 ;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++) {
            double reply;
            int random1 = (int)(Math.random() * 10);
            int random2 = (int)(Math.random() * 10);
            int answer = random1 * random2;
            String str = String.format("How much is %d times %d", random1, random2);
            System.out.println(str);
            reply = sc.nextInt();
            if (reply == answer) {
                numberOfCorrect++;
            }

        }
        String finalStatement = String.format("correct %d", numberOfCorrect);
        System.out.println(finalStatement);
    }

    public static int divide(int numerator, int divisor) {
        int res = 0;
        while (numerator >= divisor) {
            numerator -= divisor;
            res++;
        }

        return res;
    }

    public static int modulus(int m , int n) {
        while (m >= n) {
            m -= n;
        }

        return m;
    }

    public static int countDigits(int n) {
        int ptr1 = 0 ;
        int res = 0;
        String stringified = String.valueOf(n);
        while (ptr1 < stringified.length()) {
            res++;
            ptr1++;
        }

        return res;
    }

    public static int position(int n, char digit) {
        int ptr1 = 0 ;
        String stringified = Integer.toString(n);
        while (ptr1 < stringified.length()) {
            System.out.println(stringified.charAt((ptr1)));
            if (stringified.charAt((ptr1)) == (digit)) {
                return ptr1 + 1;

            }
            ptr1++;


        }

        return -1;
    }



}
