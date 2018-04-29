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
public class BurgerFactory {

    
    Director BurgerDirector = new Director();
    public BurgerFactory() {
    }
    
    public void TakeOrder(String BurgerType)
    {
        if(BurgerType.equalsIgnoreCase("C"))
        {
            BurgerIBuilder Burger = new ChickenBurger();
            BurgerDirector.Construct(Burger);
            
        }else
        {
            BurgerIBuilder Burger = new BeefBurger();
            BurgerDirector.Construct(Burger);
        }
        BurgerDirector.ShowDelivery();
    }
    
}
