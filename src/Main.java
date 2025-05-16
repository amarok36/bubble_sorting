import java.util.Random;

public class Main {
    public static void main(String[] args) {

            int[] nums = new int[12];

            Random rnd = new Random();

            for (int i = 0; i < nums.length; i++) {
                nums[i] = rnd.nextInt(21) - 10;
            }

            System.out.println("Инициализирован массив: ");
            display(nums);

            int[] sortedNums = sortArray(nums);
            System.out.println("\nПроизведена сортировка.");

            System.out.println("\nОтсортированный массив: ");
            display(sortedNums);
        }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] arr) {
        try{
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j + 1] < arr[j]) {
                        int swap = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = swap;
                    }
                }
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.err.println("Ошибка.Выход за пределы массива");
        } catch (Exception e) {
                System.err.println("Ошибка. " + e.getMessage());
        }
        return arr;
    }
}

