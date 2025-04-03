public class P3Q2 {

    public static int indexOfSmallestElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        int[] list = {1, -2, 4, 5, 10, 200, -32, -22};
        int smallestIndex = indexOfSmallestElement(list);
        System.out.println("The index of the smallest element is: " + smallestIndex);
    }
}