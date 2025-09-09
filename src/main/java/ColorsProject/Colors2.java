package main.java.ColorsProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colors2
{

        public static void main(String[] args) {
            List<String> colors = new ArrayList<String>() {{
                add("red");
                add("green");
                add("blue");
                add("yellow");
            }};

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
        public static void PrintAllItems(List<String> list)
        {


                    }

        public static void PrintItemCount(List<String> list) {
            System.out.println(list.size());
        }

        public static void PrintNumberedListOfItems(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }
        }

        public static void PrintRandomItem(List<String> list) {
            Random random = new Random();
            int randomIndex = random.nextInt(list.size());
            System.out.println(list.get(randomIndex));
        }

        public static void PutItemsInAlphabeticalOrder(List<String> list) {
            List<String> sortedList = new ArrayList<>(list);
            for (int i = 0; i < sortedList.size(); i++) {
                for (int j = i + 1; j < sortedList.size(); j++) {
                    if (sortedList.get(i).compareTo(sortedList.get(j)) > 0) {
                        String temp = sortedList.get(i);
                        sortedList.set(i, sortedList.get(j));
                        sortedList.set(j, temp);
                    }
                }
            }
            for (String item : sortedList) {
                System.out.println(item);
            }
        }
    }

