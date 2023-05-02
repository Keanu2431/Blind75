namespace csharp.Arrays;

public class TwoSum
{
    public static int[] Solution(int[] nums, int target)
    {
        Dictionary<Int32, Int32> solutions = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            int alpha = target - nums[i];
            int k;
            if (solutions.TryGetValue(alpha,out k))
                return new[] { k, i };
            else
                solutions[nums[i]] = i;
        }

        return new int[2];
    }
}