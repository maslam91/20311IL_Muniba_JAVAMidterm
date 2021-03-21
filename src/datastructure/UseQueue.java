package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


        // We cannot creates of a Queue since it's an interface. thus we
        Queue<String> movie = new LinkedList<>();

        //How to add to a list or queue -> referenceName.add
        //Add elements to the Queue
        movie.add("Horror Movie"); // ->true
        movie.add("Comedy Movie"); // ->
        movie.add("International Movie"); // ->true
        movie.add("Documentary Movie"); //-> true
        movie.add("Foreign Movie"); // ->true

        //-> false <- because there is no data so hasNext () will return false

        //Display the queue
        System.out.println("The first queue is : " + movie);

        //Create an iterator for the queue -> using iterator () method
        Iterator<String> amc = movie.iterator();

        //Display the values after iteration -> through the list
        System.out.println("/n The queue after iterator :");

        {
        }
        while (amc.hasNext()) ;
        { //hasNext() return true or false if there is data
            System.out.println(amc.next());
        }
        String bored[] = {" Watch ", " Movie ", " At ", " Home ", " Save ", " Money ",}; //Made an 1D array
        for (String scaryMan : bored) {
            System.out.println(scaryMan);

            {
            }
            System.out.println("*****************");
            movie.poll(); //retrieves and removes head of this queue -> returns null if empty
            System.out.println("\nQueue after poll" + movie);
            movie.remove();//retrieves and removes head of the queue -> throws exception if empty
            System.out.println("\nQueue after remove : "+movie);
            movie.peek();//retrieves head of this queue but does not remove -> returns null if empty
            System.out.println("\nQueue after peek : "+movie);
            System.out.println("\nPeek method displays : "+movie.peek()); //returns head of queue
            movie.element();//retrieves head of queue but does not remove -> throws exception if empty
            System.out.println("\n Element method displays :"+movie.element());
            movie.contains("Horror Movie"); //Returns true if this collection
            System.out.println("\nElement method displays :"+movie.contains("Horror Movie"));

        }

    }
}