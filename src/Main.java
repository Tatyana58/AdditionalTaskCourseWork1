import java.util.Arrays;
import java.util.Scanner;

/**Необходимо реализовать следующий метод:

 1. Получаем на входе массив чисел.

 2. Все четные числа увеличиваем на единицу.

 3. Возвращаем кусок списка с 3-го по 7-й элемент.
 *
 */
public class Main {
    public static class ReturningAnArray {
        public int[] createArray() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array that is to be created:: ");
            int size = sc.nextInt();
            int[] myArray = new int[size];
            System.out.println("Enter the elements of the array ::");
            for (int i = 0; i < size; i++) {
                myArray[i] = sc.nextInt();
            }
            return myArray;
        }
    }
        public static void main(String[] args) {
            ReturningAnArray obj = new ReturningAnArray();
            int arr[] = obj.createArray();
            System.out.println("Array created is :: " + Arrays.toString(arr));
        }
    }

   /* public static void main(String[] args) {
        System.out.println("Заданный массив :");
        int[] arr = {2,4,7,8,12,45,36,47,86,30,34,31,46,65,37,18};15
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y]+",");
        }
        System.out.println("\b\n");
        add1(arr);
        System.out.println("\n");
        refundArray(arr);
    }
    public static int add1(int [] arr) {
        int x = 0;
        System.out.println("Все четные числа увеличили на единицу.");
        //Все четные числа увеличиваем на единицу
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
                x = arr[i];
            } else {
                x = arr[i];
            }
                System.out.print(x + ",");
        }
        return x;
    }
    //Возвращаем кусок списка с 3-го по 7-й элемент.
    public static int refundArray(int [] arr) {
        int x= 0;
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент.");
        for (int i = 0; i < arr.length; i++) {
            if (i > 1 && i < 7) {
                x = arr[i];
                System.out.print(x + ",");
            }
        }return x;
    }

    */
