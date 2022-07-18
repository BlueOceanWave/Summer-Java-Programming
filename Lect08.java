
import java.util.*;

public class Lect08 {
    public static void main(String[] args){

        //Declaration and Initialization
        int[] heights = {1, 3, 5};
        boolean isOn[] = {true, false, true, false, false, false, true};

        char[] sentence = new char[20];
        String[] names = new String[7];
        


        //Accessing elements
        System.out.println(heights[1]);

        //Changing elements
        heights[1] = 7;
        System.out.println(heights[1]);

        //Initializing elements
        System.out.println(names[0]);
        names[0] = "Bob";
        names[1] = "Roman";
        names[2] = "Smith";
        names[3] = "Carla";
        names[4] = "John";
        names[5] = "Emily";
        names[6] = "Lucas";

        //Getting length
        System.out.println("length of names array: " + names.length);

        //Loopoing through an array
        for(int i = 0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }



        //Using loops to initialize an array
        int[] nums = new int[10];
        
        for(int i=1; i<=nums.length; i++){
            nums[i-1] = i*2;
            System.out.println(nums[i-1]);
        }

        //Look into for-each loops
        int[][] grid = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0},
                        };
                    
        int[][] grid2 = new int[4][3];
        
        int[][][][][][] grid3;




        //ArrayLists
        ArrayList<String> titles = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        
        numbers.add(0);
        titles.add("Harry Potter");
        System.out.println(titles.get(0));

    }
}
