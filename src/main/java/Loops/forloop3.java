package Loops;

import java.util.ArrayList;
import java.util.List;

public class forloop3 {
    private static final List<String> COLORS = new ArrayList<String>() {{
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
        System.out.println("Index of 'Green': " + getIndexOfColor("Green"));
        System.out.println("Is 'Blue' in the list? " + checkIfColorIsInList("Blue"));
    }

    public static int getIndexOfColor(String color) {
        for (int i = 0; i < COLORS.size(); i++) {
            if (COLORS.get(i).equals(color)) {
                return i;
            }
        }
        return -1; // Return -1 if the color is not found
    }

    public static boolean checkIfColorIsInList(String color) {
        for (String c : COLORS) {
            if (c.equals(color)) {
                return true;
            }
        }
        return false; // Return false if the color is not found
    }
}