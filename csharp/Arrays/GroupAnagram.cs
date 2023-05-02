using System.Collections.ObjectModel;

namespace csharp.Arrays;

public class GroupAnagram
{
    public static IList<IList<string>> Solution(string[] strs)
    {
        Dictionary<string, List<string>> dictionary = new Dictionary<string, List<string>>();
        IList<IList<string>> ans = new List<IList<string>>();

        foreach (var s in strs)
        {
            char[] charKey = s.ToCharArray();
            Array.Sort(charKey);
            string i = new string(charKey);
            if (!dictionary.ContainsKey(new string(charKey)))
            {
                dictionary.Add(i, new List<string>());
            }

            dictionary[i].Add(s);
        }

        foreach (var pair in dictionary)
        {
            ans.Add(pair.Value);
        }

        return ans;
    }
}