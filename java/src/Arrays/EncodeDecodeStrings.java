package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    static public String encode(List<String> strs) {
        // write your code here
        StringBuilder str = new StringBuilder();
        for (String s : strs) {
            str.append(s).append("%nl%");
        }
        return str.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    static public List<String> decode(String str) {
        // write your code here
        return new ArrayList<>(List.of(str.split("%nl%")));
    }
}
