/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgershop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BurgerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BurgerFactory burgerFactory = new BurgerFactory();
        
        while(true)
        {
            System.out.println("Which Burger do you want ?");
            Scanner sc = new Scanner(System.in);
            String type = sc.nextLine();
            burgerFactory.TakeOrder(type);
        }
        
    }
    
}
