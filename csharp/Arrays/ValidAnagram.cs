namespace csharp.Arrays;

public class ValidAnagram
{
    public static bool Solution(string s, string t)
    {
        if (s.Length != t.Length) return false;
        int[] charArray = new int[26];
        for (int i = 0; i < s.Length; i++)
        {
            charArray[s[i] - 'a']++;
            charArray[t[i] - 'a']--;
        }
        //
        // Console.WriteLine("[{0}]", String.Join(", ", charArray));
        foreach (var k in charArray)
        {
            if (k != 0) return false;
        }
        return true;
    }
}