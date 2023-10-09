import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int i = 0;

            for (int number = 100; number <= 1000; number ++){

                if (number % 5 == 0 && number % 6 == 0) {
                    System.out.print(number + " ");
                    i ++;

                    if (i % 10 == 0) {
                        System.out.println();
                    }
                }
            }
        }
    }





