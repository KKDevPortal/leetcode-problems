package arrayManupulation;

import java.util.ArrayList;
import java.util.List;

public class duplicateElementP1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,1,3,5,6,7,1,2};
        List<Integer> dupllicateElement = new ArrayList<>();

        // find all duplicate elemet availbe
        for(int i=0;i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                // check
                    // array i position value is equal to array j posyion value
                    // index i and j not eqaul, as it will contain same value
                    // if duplicateElement already contain value ignore it
                if((arr[i] == arr[j]) && (i!=j) && (!dupllicateElement.contains(arr[i]))) {
                    dupllicateElement.add(arr[i]);
                }
            }
        }

        System.out.println("Duplicate elemrent :"+ dupllicateElement);

    }
}
