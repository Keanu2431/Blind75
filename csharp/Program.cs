using System.Text.Json;
using csharp.Arrays;

class Program
{
    public static void Main(string[] args)
    {
        var i = ProductExceptSelf.Solution(new int[] { 1, 2, 3, 4 });
        Console.WriteLine(JsonSerializer.Serialize(i));
    }
}