package Loops;

import java.util.ArrayList;
import java.util.List;

public class forloop2 {
    private static List<String> colors = new ArrayList<String>() {{
        add("Red");
        add("Green");
        add("Blue");
        add("Yellow");
        add("Black");
        add("White");
        add("Orange");
        add("Purple");
        add("Pink");
        add("Brown");
    }};

    public static void main(String[] args) {
        getIndexOfColor("Green");
        checkIfColorIsInList("Blue");
    }

    public static int getIndexOfColor(String color) {
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                return i;
            }
        }
        return -1; // Return -1 if the color is not found
    }

    public static boolean checkIfColorIsInList(String color) {
        for (String c : colors) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false; // Return false if the color is not found
    }
}