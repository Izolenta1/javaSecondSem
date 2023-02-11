package prac1;

import java.util.Arrays;

public class ConsumerTest{
    public static void main(String[] args) {
        Consumer calc;
        calc = (mas) -> {
            Arrays.sort(mas);
            System.out.println(Arrays.toString(mas));
        };

        int testMas[] = {9, 2, 3, 5, 4, 0};
        calc.number(testMas);
    }
}