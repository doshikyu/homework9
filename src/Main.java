import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int sum(){
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element:arr){
            sum += element;
        }
        return sum;
    }
    public static void task1(){
        System.out.println("Задача 1\nСумма трат за месяц составила " + sum() + " рублей");
    }
    public static void task2(){
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
//  ----LOOP PRACTICE------
//        int max = 0;
//        int min = 200_000;
//        for (int element:arr){
//            if (element > max){
//                max = element;
//            }
//            if (element < min){
//                min = element;
//            }
//        }
//  ----ELEGANT SOLUTION------
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        float averageSpending;
        int sum = sum();
        averageSpending = (float) sum/arr.length;
        System.out.println(averageSpending);
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}