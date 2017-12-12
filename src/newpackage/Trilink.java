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
public class Trilink 
{
    //node for node class
    //integers to count nodes
    private int v1 = 0;
    private int v2 = 0;
    private Node root;
    
    // insert and recInsert for btree
    //takes the value given
    
    public void insert(int val)
    {
        //if tree is null, add from root
        if (root == null)
        {
            //create node and set first value
            root = new Node();
            root.setValue1(val);
        }
        else
            recInsert(root, val);
    }
    
    private void recInsert(Node curNode, int val)
    {  
        //to set 2nd value
        if ( val > curNode.getValue1())
        {
            //if the value is greater than 1st, no 2nd value, set 2nd
            if(curNode.isEmpty2())
            {
                curNode.setValue2(val);
            }               
            else
            {
                //value is greater, go to high link
            if (curNode.high == null)
                {
                    //temp node, set value,link parent and high
                    Node temp = new Node();
                    temp.setValue1(val);
                    temp.parent = curNode;
                    curNode.high = temp;     
                }
                else
                //link high nodes
                    recInsert(curNode.high, val);
            }
        }
        
        //middle links
            if (val > curNode.getValue1() && val < curNode.getValue2())
            {
                if (curNode.medium == null)
                {
                    Node temp = new Node();
                    temp.setValue1(val);
                    temp.parent = curNode;
                    curNode.medium = temp;     
                }
                else
                    recInsert(curNode.medium, val);
            }
        
        else
        {
            //next value is less than first
            if (val < curNode.getValue1())
            {
                //creat link to low
                if (curNode.low == null)
                {
                    Node temp = new Node();
                    temp.setValue1(val);
                    temp.parent = curNode;
                    curNode.low = temp;     
                }
                else
                    //link low nodes
                    recInsert(curNode.low, val);
            }            
            
        }         
    }
    
    //find value/key
    //find used in search and delete
    //item v node v tree
    //node v tree
    //recfind??
    //need to initialize node use
    //cant insert int from main (need node AND int)
    //find and delete are similar
    
    public boolean recdelete (Node curNode, int key, boolean active)
    {
        if (curNode != null && curNode.active == true)
        { 
            if (key <= curNode.getValue1() && curNode.low != null)
            {
                   return recfind(curNode.low, key, active);
            }

            if (key > curNode.getValue1())
            {
                if (!curNode.isEmpty2() && key < curNode.getValue2()) 
                {
                    if (curNode.medium != null)
                    {
                        return recfind(curNode.medium,key, active);
                    }
                }
                if (!curNode.isEmpty2() && key >= curNode.getValue2()) 
                {
                    if (curNode.high != null)
                    {
                        return recfind(curNode.high,key, active);
                    }
                }  

            }
            
            //change active flag for deletes
            if (curNode.getValue1() == key && curNode.active) 
        {
            curNode.inActive();
           return curNode.active = active;
        }
            
        //delete key
        if (curNode.getValue2() == key && curNode.active) 
        {
            curNode.inActive();
          return curNode.active = active;
        } 
        }
        return true;
    }
    
        public boolean delete(int key)
    {
        //if returned false, value is deleted
        return recdelete(root, key, false);         
    }
    
    public boolean find(int key)
    {
        //if returned true, value is found
        return recfind(root, key, true);
    }
    
    
    private boolean recfind(Node curNode, int key, boolean active)
    {
        //initialized to true or false??
        boolean check = true;
        //search nodes and links
        if (curNode != null && curNode.active == true)
        { 
            if (key <= curNode.getValue1() && curNode.low != null)
            {
                   return recfind(curNode.low, key, active);
            }

            if (key > curNode.getValue1())
            {
                if (!curNode.isEmpty2() && key < curNode.getValue2()) 
                {
                    if (curNode.medium != null)
                    {
                        return recfind(curNode.medium,key, active);
                    }
                }
                if (!curNode.isEmpty2() && key >= curNode.getValue2()) 
                {
                    if (curNode.high != null)
                    {
                        return recfind(curNode.high,key, active);
                    }
                }  

            }
            
        }
        return check;
    }
    
        public String print()
    {   
        //print string
        //combine other methods
        //initialize count values
        v1 = 0;
        v2 = 0;
        //string to return
        String out = recprint(root) + count(root);
        return out;
    }
    
    private String recprint(Node curNode)
    {
        String out = "";

        if (curNode != null)
        {
            //print all low nodes
            out += recprint(curNode.low);
            //if the node is not deleted or empty, print
            if (curNode.active && !curNode.isEmpty1()) 
            {
                out += curNode.getValue1() + ", ";
            }
            //print medium nodes
            out += recprint(curNode.medium);
            //if the node is not deleted or empty, print
            if (curNode.active && !curNode.isEmpty2())
            {
                out += curNode.getValue2() + ", ";
            }
            //print high nodes
            out += recprint(curNode.high);
        }
        
        return out;
    }
    
    private String count(Node curNode)
    {     
        //string to hold count
        String out = "";
        //node is not null
        if (curNode != null)
        {
            //count values of node
            if (curNode.isEmpty2())
                v1++;
            else
                v2++;
            
            //continue to other links
            count(curNode.low);
            count(curNode.medium);
            count(curNode.high);
            
            out = "\n 1value nodes: " + v1+ "\n 2value nodes: " + v2;
        }
        
        //return string for count
        return out;
}    
    
    
}
