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
public interface BurgerIBuilder {
    
    void AddBun();
    void AddPatty();
    void AddSoss();
    void AddCheese();
    void AddPrice();
    Product DeliveryProduct();
    
}
