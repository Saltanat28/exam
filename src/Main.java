import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[20];
        for (int i = 0; i < number.length; i++) {
            int numb = random.nextInt(1, 50);
            number[i] = numb;
            System.out.print(number[i] + "," + "  ");
        }

        System.out.println();
        m1(number);
    }

    public static void m1(int[] number) {
        int counter = 30;
        for (int i = 0; i < number.length; i++) {
            if (30 < number[i]) {

                System.out.print(number[i] + " ");


            }


        }
    }
}

