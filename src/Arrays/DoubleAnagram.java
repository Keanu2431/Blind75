package Arrays;

import java.util.*;

public class DoubleAnagram {
    public static List<List<String>> solution(String[] strs) {
//        CREATE RESPONSE ARRAY
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
//        CREATE A HASHMAP
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
//            CREATING ARRAY TO MAP EACH OCCURING CHARACTER
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
//            CREATE A KEY FOR HASHMAP BASED OFF OF CHARACTER HASH
            String key = new String(java.util.Arrays.toString(hash));
//            System.out.println(key);
//            IF HASHMAP DOESNT HAVE A KEY MATCHING THE KEY WE JUST CREATED INITIALIZE IT
//            WITH EMPTY ARRAY
            map.computeIfAbsent(key, k -> new ArrayList<>());
//          IN THE HASHMAP WE WANT TO GET THE KEY CORRESPONDING TO CURRENT ITERATIONS
//            CHARACTER/ALPHABET HASH AND ADD THE CURRENT ITERATIONS STRING TO THE LIST
            map.get(key).add(s);
        }
//        HASHMAP.VALUES() RETURNS THE VALUE OF EACH KEY
//        LIST.ADDALL
        res.addAll(map.values());
        return res;
    }


}
