/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgershop;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Product {
    
    private LinkedList<String> list = new LinkedList<>();

    public Product() {
    }
    
    public void AddElements(String element)
    {
        list.add(element);
    }
    
    public void DeliverOrder()
    {
        for(int i = 0 ;  i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }
    
}
