//Using Gridlayout component in GUI
import java.awt.*;
import javax.swing.*;
public class Gridlayout {
JFrame frameObj;    
      
    // constructor  
    Gridlayout()  
    {    
    frameObj = new JFrame();    
      
    // creating 9 buttons  
    JButton btn1 = new JButton("banana");    
    JButton btn2 = new JButton("apple");    
    JButton btn3 = new JButton("mango ");    
    JButton btn4 = new JButton("sweets");    
    JButton btn5 = new JButton("pee");    
    JButton btn6 = new JButton("kiwi");    
    JButton btn7 = new JButton("pomegranate");    
    JButton btn8 = new JButton("pineapple");    
    JButton btn9 = new JButton("orange");    
        
    // adding buttons to the frame  
    // since, we are using the parameterless constructor, therfore;   
    // the number of columns is equal to the number of buttons we   
    // are adding to the frame. The row count remains one.  
    frameObj.add(btn1); 
    frameObj.add(btn2); 
    frameObj.add(btn3);  
    frameObj.add(btn4); 
    frameObj.add(btn5); 
    frameObj.add(btn6);  
    frameObj.add(btn7); 
    frameObj.add(btn8); 
    frameObj.add(btn9);    
      
    // setting the grid layout using the parameterless constructor    
    frameObj.setLayout(new GridLayout());    
      
      
    frameObj.setSize(500, 100);    
    frameObj.setVisible(true);    
    }  
      
    // main method  
    public static void main(String args[])   
    {    
    new Gridlayout();    
    }    
    }     
