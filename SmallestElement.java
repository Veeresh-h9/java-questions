public class SmallestElement {
    public static void main(String[] args) {
        //initialize array & assume first element is smallest
        int[] arr = {1, 5, 3, 9, 2};
        int min = arr[0];//
        //traverse the array
        for (int i = 1; i < arr.length; i++) {
        //compare and find the smallest element
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //print the smallest element
        System.out.println("Smallest element is: " + min);
    }
}
