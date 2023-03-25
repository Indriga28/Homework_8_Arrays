import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task12();
        task3();
        task4();
    }

    public static void task12 () {
        System.out.println("Задача 12");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        System.out.println(Arrays.toString(numbers));

        double [] numbersTwo = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbersTwo));

        float [] numberThree = {3.22f, 56, 89.678f};
        System.out.println(Arrays.toString(numberThree));

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        for (int index = numbers.length; index > 0; index--) {
            System.out.print(numbers[index - 1]);
            if (index > 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        double [] numbersTwo = {1.57, 7.654, 9.986};
        for (int i = numbersTwo.length; i > 0 ; i--) {
            System.out.print(numbersTwo[i - 1]);
            if (i > numbersTwo [0]){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        float [] numberThree = {3.22f, 56, 89.678f};
        for (int i = numberThree.length; i > 0; i--) {
            System.out.print(numberThree [i - 1]);
            if (i != numberThree.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] array = {1,2,3};
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i]%2 != 0)
            array[i] = array[i] +1; {
                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}