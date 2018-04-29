/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgershop;

/**
 *
 * @author User
 */
public class Director {
    
    BurgerIBuilder myBurger = null;
    
    public void Construct(BurgerIBuilder burger)
    {
        myBurger = burger;
        myBurger.AddBun();
        myBurger.AddCheese();
        myBurger.AddPatty();
        myBurger.AddSoss();
        myBurger.AddPrice();
    }
    public void ShowDelivery()
    {
        if(myBurger != null)
        {
            Product product = myBurger.DeliveryProduct();
            product.DeliverOrder();
        }
    }
    
}
