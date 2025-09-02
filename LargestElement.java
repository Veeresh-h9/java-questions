public class LargestElement {
    public static void main(String[] args) {
        //initialize array
        int[] arr = {1, 5, 3, 9, 2};
        //assume first element is largest
        int max = arr[0];
        //traverse the array 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //print the largest element
        System.out.println("Largest element is: " + max);
    }
}