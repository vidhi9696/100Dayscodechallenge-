// Java program to remove an item from 
// LinkedList collection

import java.util.LinkedList;
public class Main {
  public static void main(String[] args) {
    LinkedList < String > countries = new LinkedList < String > ();

    countries.add("ShriLanka");
    countries.add("India");
    countries.add("China");
    countries.add("UK");

    System.out.println("Country names before removing item: " + countries);

    countries.remove("China");

    System.out.println("Country names after removing item: " + countries);
  }
}

//Output-
//Country names before removing item: [ShriLanka,India, China,UK]
//Country names after removing item: [ShriLanka,India,UK]
