package ColorsProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Colors1
{



        public static void main (String[]args)
        {
            List < String > colors = new ArrayList<String>();
                colors.add("red");
                colors.add("green");
                colors.add("blue");
                colors.add("yellow");



        PrintAllItems(colors);

        System.out.println("\n-----------------------------------\n");

        PrintItemCount(colors);

        System.out.println("\n-----------------------------------\n");

        PrintNumberedListOfItems(colors);

        System.out.println("\n-----------------------------------\n");

        PrintRandomItem(colors);

        System.out.println("\n-----------------------------------\n");

        PutItemsInAlphabeticalOrder(colors);
        }

        /// <summary>
        /// Prints all items in the provided list to the console.
        ///
        /// ESTIMATED DIFFICULTY: EASY
        ///
        /// EXPECTED OUTPUT:
        /// red
        /// green
        /// blue
        /// yellow
        /// </summary>
        /// <param name="list">A list of items to print to the console</param>
        public static void PrintAllItems (List < String > list) {
            for (String item : list) {
                System.out.println(item);
            }
        }
        /// <summary>
        /// Determines how many items are in the list and prints the count to the console.
        ///
        /// ESTIMATED DIFFICULTY: EASY
        ///
        /// EXPECTED OUTPUT:
        /// 4
        /// </summary>
        public static void PrintItemCount (List < String > list) {
        System.out.println(list.size());
    }

        /// <summary>
        /// Prints a numbered list of items to the console (numbering should start at 1)
        ///
        /// ESTIMATED DIFFICULTY: MEDIUM
        ///
        /// EXPECTED OUTPUT:
        /// 1. red
        /// 2. green
        /// 3. blue
        /// 4. yellow
        /// </summary>
        /// <param name="list"></param>
        /// <returns></returns>
        public static void PrintNumberedListOfItems (List < String > list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

        /// <summary>
        /// Selects a single item from the list at random
        ///
        ///
        /// ESTIMATED DIFFICULTY: HARD
        ///
        /// EXPECTED OUTPUT:
        /// Each run should print a randomly selected item from the list (e.g. blue)
        public static void PrintRandomItem (List < String > list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size());
        String randomItem = list.get(randomIndex);
        System.out.println(randomItem);
    }

        /// <summary>
        /// Put the items in the list in alphabetical order WITHOUT using built-in sort method
        ///
        /// ESTIMATED DIFFICULTY: VERY HARD
        ///
        /// EXPECTED OUTPUT:
        /// blue
        /// green
        /// red
        /// yellow
        public static void PutItemsInAlphabeticalOrder (List < String > list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        PrintAllItems(list);
    }

}
