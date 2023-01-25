// Java program to create a LinkedList collection 
// of objects of a class

import java.util.*;

class Complex {
  int real, img;

  Complex(int r, int i) {
    real = r;
    img = i;
  }
}
public class Main {
  public static void main(String[] args) {
    int i = 0;
    LinkedList < Complex > list = new LinkedList < Complex > ();

    list.add(new Complex(10, 20));
    list.add(new Complex(20, 30));
    list.add(new Complex(30, 40));
    list.add(new Complex(40, 50));

    System.out.println("List items: ");

    for (i = 0; i < 4; i++) {
      Complex C = list.poll();
      System.out.println(C.real + " + " + C.img + "i");
    }
  }
}
