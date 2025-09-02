public class SumArray {
    public static void main(String[] args) {
        //initialize array and sum variable
        int[] arr = {1, 5, 3, 9, 2};
        int sum = 0;
        //traverse the array and calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //print the sum of elements
        System.out.println("Sum of elements is: " + sum);
    }
}
