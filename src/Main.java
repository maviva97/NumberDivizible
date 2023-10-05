import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter =100;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (counter%5==0||counter%6==0)
                {System.out.print(counter);
                System.out.print(" "); }// I think it is best to have spaces between the numbers
                counter=counter + 10;
                       if (counter >= 1000) break;}
            //after printing 10 numbers, go to a new line
            System.out.println();
        }
    }
}