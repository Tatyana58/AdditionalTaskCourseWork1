import java.util.Arrays;

/**Необходимо реализовать следующий метод:

 1. Получаем на входе массив чисел.

 2. Все четные числа увеличиваем на единицу.

 3. Возвращаем кусок списка с 3-го по 7-й элемент.
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Заданный массив :");
        int[] arr = {2,4,7,8,12,45,36,47,86,30,34,31,46,65,37,18};
        System.out.println(Arrays.toString(arr));
        add1(arr);
        System.out.println("\n");
        refundArray(arr);
    }
    public static int[] add1(int [] arr) {
        int[] newArr = new int[arr.length];
        System.out.println("Все четные числа увеличили на единицу.");
        //Все четные числа увеличиваем на единицу
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i];
            }
        }
        System.out.print(Arrays.toString(newArr));
        return newArr;
    }
    //Возвращаем кусок списка с 3-го по 7-й элемент.
    public static int[] refundArray(int [] arr) {
        int[] newArr = Arrays.copyOfRange(arr,2,7);
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент.");
        System.out.print(Arrays.toString(newArr));
        return newArr;
    }
    /*    int size =0;
        //System.out.println("Узнаем длинну массива = ");
        for (int i = 0; i < arr.length; i++) {
            if (i > 1 && i < 7) {
                size++;
            }
        }
        System.out.println("Длина нового массива = "+ size);
        int[] newArr = new int[size];
        int j=0;
        System.out.println("Возвращаем кусок списка с 3-го по 7-й элемент.");
            for (int i = 0; i < arr.length; i++) {
                if (i > 1 && i < 7) {
                    newArr[j] = arr[i];
                    System.out.print(newArr[j] + ",");
                    j++;
                }
            }
            System.out.print("\b");
            return newArr;
      }
     */
}
