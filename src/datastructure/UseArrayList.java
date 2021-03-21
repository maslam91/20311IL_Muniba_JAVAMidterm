package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        //Made an arrayList of String with reference name list
        ArrayList<String> List = new ArrayList();

        List.add("Be");
        List.add("The");
        List.add("Change");
        List.add("That");
        List.add("You");
        List.add("Wish");
        List.add("To");
        List.add("See");
        List.add("In");
        List.add("The");
        List.add("World");

        //Displaying the list
        System.out.println("*** This list is : /n *** + list");

        //Create an iterator for the list
        //By using iterator () method
        Iterator<String> iter = List.iterator();

        //Display the list after iterating through the list
        System.out.println("/nThe iterator values" + "of list are :");
        {
        }
        while (iter.hasNext()) {//Boolean condition <- if next string value had defined data return true

            //Helps identify string variables with defined data "what we need"
            System.out.println(iter.next() + "");
        }

        String arr[] = {" ", " - Mahatma Gandhi -"};
        for (String str : arr) {
            System.out.println(str);


        }

    }

}