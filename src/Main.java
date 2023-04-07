import Arrays.TopKFrequent;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> i = TopKFrequent.solution(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(i);
    }
}