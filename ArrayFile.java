import java.util.Arrays;

public class ArrayFile {
    public static void main(String[] args) {
//        Array is a reference type
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 34;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
//        It sorts the array here with the Arrays class used here
        System.out.println(Arrays.toString(arr));

//        Another way of having the array initialized here and arrays have the fixed length.
        int[] newArr = {1, 2, 3, 4, 5};

    }
}
