public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The average is: " +
                average(numbers));
    }
    // Non-working average function (needs a fix)
    public static double average(int[] nums) {
// Placeholder: This function is incomplete and]
        int sum = 0;
        for (int i=0; i < nums.length; i++){
            sum += nums[i];
        }
        sum / nums.length;
        currently returns 0
        return 0;
    }
}