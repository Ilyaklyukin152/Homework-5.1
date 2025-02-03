public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int[] arr = {51922, 89856, 39423, 49863, 21587};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("\nЗадача 2");
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. " +
                "Максимальная сумма трат за неделю составила " + max + " рублей");

        System.out.println("\nЗадача 3");
        float avg;
        avg = (float) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n",avg);

        System.out.println("\nЗадача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (char i : reverseFullName) {
            System.out.printf(i + "");
        }
    }
}