namespace csharp.Arrays;

public class ContainsDuplicate
{
    public static bool Solution(int[] nums)
    {
        HashSet<int> ints = new HashSet<int>();
        foreach (var i in nums)
        {
            if (ints.Contains(i)) return true;
            ints.Add(i);
        }

        return false;
    }
}