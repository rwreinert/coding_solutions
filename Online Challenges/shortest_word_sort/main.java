/*
Requirements:

Given some user input, sort the words of the sentence or paragraph
in order based on word length and print out for the user.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        String inputString = "";

        Scanner scan = new Scanner(System.in);
        inputString = inputString + scan.nextLine() + " "; // Just read the next line of input
        scan.close();

        // Call the method to process input.
        print(inputString);
    }

    public static void print(String input) {
        // Remove periods
        // split based on spaces
        System.out.println(input);
        String[] strList = input.split(" ");
        HashMap<Integer, List<String>> map = new HashMap<>();

        // Loop thru array
        for (int i = 0; i < strList.length; i++) {
            String str = strList[i].replaceAll("\\.", ""); //Remove the periods
            //Check if pairing exists
            if (!map.containsKey(str.length())) {
                map.put(str.length(), new ArrayList<>());
            }
            map.get(str.length()).add(str); //Add the map
        }

        //Sort keys
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort lengths of the list
        Collections.sort(list);

        for (Integer i : list) {
            for (String s : map.get(i)) {
                System.out.print(s + " ");
            }
        }
        System.out.println("");
    }

}