package BitManipulation;

public class NumberOneBits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            System.out.println(n);
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
