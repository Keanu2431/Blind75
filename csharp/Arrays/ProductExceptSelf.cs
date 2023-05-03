namespace csharp.Arrays;

public class ProductExceptSelf
{
    public static int[] Solution(int[] nums)
    {
        int[] answer = new int[nums.Length];
        int counter = 1;
        for (int i = 0; i < nums.Length; i++)
        {
            answer[i] = counter;
            counter *= nums[i];
        }

        counter = 1;
        for (int i = nums.Length - 1; i >= 0; i--)
        {
            answer[i] *= counter;
            counter *= nums[i];
        }

        return answer;
    }
}