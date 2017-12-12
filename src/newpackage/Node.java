/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Alina
 */
public class Node 
{
    //1 node, 2 values
    //linked to low, medium, or high nodes
    //linked back to parent node
    //boolean for delete/inactive
    //boolean to check if the first value is empty
    
   public int value1;
   public int value2;
   public Node low;
   public Node medium;
   public Node high;
   public Node parent;   
   //set to true for active
   boolean active = true;
   //set to true for empty
   boolean empty1 = true;
   //should be boolean for 2nd value??
   //a value higher that value1 should be put in value 2 if it is empy
   //or made to a new link
   boolean empty2 = true;
   
   //get& set variables

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
        //set empty flag to false
        empty1 = false;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
        //set empty flag to false
        empty2 = false;
    }
    
    public void deleteItem()
   {
       active = false;
   }

    public boolean isActive() {
        return active;
    }
    
    //will return value as inactive/ deleted
    public void inActive() {
        active = false;
    }

    public boolean isEmpty1() {
        return empty1;
    }

    public boolean isEmpty2() {
        return empty2;
    }
   
    
    
}
