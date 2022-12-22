import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weight = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        int[] box = {15, 34, 81, 29, 17};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] weight = new int[]{1, 2, 3};
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[2]);

        double[] numbers = {1.57, 7.654, 9.986};
        System.out.println();
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2]);

        int[] box = {15, 34, 81, 29, 17};
        System.out.println();
        System.out.print(box[0] + ", ");
        System.out.print(box[1] + ", ");
        System.out.print(box[2] + ", ");
        System.out.print(box[3] + ", ");
        System.out.print(box[4]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weight = new int[]{1, 2, 3};
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[0]);

        double[] numbers = {1.57, 7.654, 9.986};
        System.out.println();
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0]);

        int[] box = {15, 34, 81, 29, 17};
        System.out.println();
        System.out.print(box[4] + ", ");
        System.out.print(box[3] + ", ");
        System.out.print(box[2] + ", ");
        System.out.print(box[1] + ", ");
        System.out.print(box[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = new int[]{1, 2, 3};

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1) {
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}