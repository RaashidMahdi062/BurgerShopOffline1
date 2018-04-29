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
public class ChickenBurger implements BurgerIBuilder{
    
    Product product = new Product();
    private Integer ExtraPattyPrice = 90;
    private Integer ExtraCheesePrice = 30;
    

    @Override
    public void AddBun() {
        product.AddElements("Bun Added");
    }

    @Override
    public void AddPatty() {
        product.AddElements("Chicken Patty Added");
    }

    @Override
    public void AddSoss() {
    
        product.AddElements("Sauce Added");     
    }

    @Override
    public void AddCheese() {
    
        product.AddElements("Cheese Added");
    
    }

    @Override
    public Product DeliveryProduct() {
    
        return product;
    }

    @Override
    public void AddPrice() {
    
        product.AddElements("Price : 230 TK only.");
    
    }
    
    
    
}
