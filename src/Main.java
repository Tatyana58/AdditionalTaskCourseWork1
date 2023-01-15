import java.util.Arrays;

/**Необходимо реализовать следующий метод:

 1. Получаем на входе массив чисел.

 2. Все четные числа увеличиваем на единицу.

 3. Возвращаем кусок списка с 3-го по  7-й элемент.
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Заданный массив :");
        int[] arr = {2,4,7,8,12,45,36,47,86,30,34,31,46,65,37,18};
        System.out.println(Arrays.toString(arr));
        add1(arr);
        System.out.println("Все четные числа увеличили на единицу.");
        System.out.println(Arrays.toString(arr));
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент.");
        System.out.println(Arrays.toString(refundArray(arr)));

    }
    public static int[] add1(int [] arr) {
        int[] newArr = new int[arr.length];
        //Все четные числа увеличиваем на единицу
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    //Возвращаем кусок списка с 3-го по 7-й элемент.
    public static int[] refundArray(int [] arr) {
        int[] newArr = Arrays.copyOfRange(arr,2,7);
        return newArr;
    }
}
