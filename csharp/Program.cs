using System.Text.Json;
using csharp.Arrays;

class Program
{
    public static void Main(string[] args)
    {
        IList<IList<string>> i = GroupAnagram.Solution(new string[] { "eat", "tea", "tan", "ate", "nat", "bat" });
        Console.WriteLine(JsonSerializer.Serialize(i));
    }
}