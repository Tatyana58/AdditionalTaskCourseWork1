public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,4,7,8,12,45,36,47,86,30,34,31,46,65,37,18};
        for (int y = 0; y < arr.length; y++) {
        System.out.print(arr[y]+",");
        }
        System.out.println("\b\n");
        add1(arr);
    }
    public static int add1(int [] arr) {
        int x = 0;
        System.out.println("Преобразованный массив: ");
        //проверка четного числа
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
                x = arr[i];
            } else {
                x=arr[i];
            }System.out.print(arr[i]+",");
        }
        return x;
    }
}