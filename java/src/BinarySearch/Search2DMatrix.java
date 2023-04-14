package BinarySearch;

import java.util.Arrays;

public class Search2DMatrix {
    public static boolean solution(int[][] matrix, int target) {
        boolean included = false;
        int outerLeft = 0, outerRight = matrix.length - 1;
        int middleOuter = (outerLeft + outerRight) / 2;
        while (outerLeft <= outerRight) {
            middleOuter = (outerLeft + outerRight) / 2;
            if (matrix[middleOuter][matrix[middleOuter].length - 1] == target) break;
            if (matrix[middleOuter][matrix[middleOuter].length - 1] < target)
                outerLeft = middleOuter + 1;
            if (matrix[middleOuter][matrix[middleOuter].length - 1] > target)
                outerRight = middleOuter - 1;
        }
        int[] innerMatrix = matrix[middleOuter];
        int innerLeft = 0, innerRight = innerMatrix.length - 1;
        System.out.println(Arrays.toString(matrix[middleOuter]));
        while (innerLeft <= innerRight) {
            int innerMiddle = (innerLeft + innerRight) / 2;
            if (innerMatrix[innerMiddle] == target) {
                included = true;
                break;
            }
            if (innerMatrix[innerMiddle] < target) innerLeft = innerMiddle + 1;
            if (innerMatrix[innerMiddle] > target) innerRight = innerMiddle - 1;
        }
        return included;
    }
    
    public static boolean solutionTwo(int[][] matrix, int target) {
        boolean included = false;
        int outerLeft = 0, outerRight = matrix.length - 1;
        int middleOuter = 0;
        while (outerLeft <= outerRight) {
            middleOuter = (outerLeft + outerRight) / 2;
            System.out.println(Arrays.toString(matrix[middleOuter]));
            
            if (matrix[middleOuter][0] == target ||
                    matrix[middleOuter][matrix[middleOuter].length - 1] == target) {
                return true;
            }
            if (matrix[middleOuter][0] < target)
                outerLeft = middleOuter + 1;
            if (matrix[middleOuter][0] > target)
                outerRight = middleOuter - 1;
            int[] innerMatrix = matrix[middleOuter];
            int innerLeft = 0, innerRight = innerMatrix.length - 1;
            
            while (innerLeft <= innerRight) {
                int innerMiddle = (innerLeft + innerRight) / 2;
                if (innerMatrix[innerMiddle] == target) {
                    included = true;
                    break;
                }
                if (innerMatrix[innerMiddle] < target) innerLeft = innerMiddle + 1;
                if (innerMatrix[innerMiddle] > target) innerRight = innerMiddle - 1;
            }
        }
     
        return included;
    }
}
