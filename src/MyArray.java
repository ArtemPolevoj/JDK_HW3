/*
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут
быть любого типа данных, но должны иметь одинаковую длину и содержать элементы
одного типа по парно. (используйте instanceof)
 */
public class MyArray {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].getClass().isInstance(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        System.out.println(compareArrays(arr1, arr2));

        String[] arr3 = {"h","e","l","l","o"};
        Character[] arr4 = {'h','e','l','l','o'};
        System.out.println(compareArrays(arr3, arr4));

        Double[] arr5 = {1.0, 2.0, 3.0};
        Integer[] arr6 = {1, 2, 3};
        System.out.println(compareArrays(arr5, arr6));

        Number[] arr7 = {1, 2, 3};
        Integer[] arr8 = {1, 2, 4};
        System.out.println(compareArrays(arr7, arr8));
    }
}
