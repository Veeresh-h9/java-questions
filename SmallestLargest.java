public class SmallestLargest {
    public static void main(String[] args) {
        //initialize array & assume first element is smallest
        int[] arr = {1, 5, 3, 9, 2};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //compare and find the largest element
            if (arr[i] > max) {
                max = arr[i];
               
            }
            //compare and find the smallest element
            if (arr[i] < min) {
                min = arr[i];
            
            }
        }
        System.out.println("Largest element is: " + max);
        System.out.println("Smallest element is: " + min);
    }
}