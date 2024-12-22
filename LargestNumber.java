public class LargestNumber {
    public static void main(String[] args) {
        int max = 9999;
        for (int i = max; i > 0; i--) {
            if (i % 10 == 0 && i % 13 == 0) {
                System.out.println("The largest 4 digit number divisible by 10 and 13 is: " + i);
                break;
            }
        }
    }
}