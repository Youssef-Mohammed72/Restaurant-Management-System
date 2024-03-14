package MealManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohanad
 */
public class MealManagementParent {
    //declearing meals
    public double chickenAndRice;
    public double frenchBreadPizza;     
    public double chickenWings;
    public double friedChicken;
    public double salmon;
    public double eggRolls;
    public double mexicanPizza;
    //declearing soups
    public double chickenNoodle;
    public double cheeseBurger;
    public double minestrone;
    public double italianWedding;
    public double tortellini;
    public double frenchOnion;
    //declearing varibales for cost of meals & cost of soups & total cost of meals and soups 
    public double meals;
    public double soups;
    public double costOfItems;
    public double allTotal;
    //-----------------------------------------------------------------
    //price of meals and soups ----------------------------------------
    public double pChickenAndRice =7.5;
    public double pFrenchBreadPizza = 10;     
    public double pChickenWings = 12;
    public double pFriedChicken = 12;
    public double psalmon = 13.5;
    public double pEggRolls = 6.5;
    public double pMexicanPizza = 15.5;
    public double pChickenNoodle = 8.95;
    public double pCheeseBurger = 4.5;
    public double pMinestrone = 3.3;
    public double pItalianWedding = 2.2;
    public double pTortellini = 4.1;
    public double pFrenchOnion = 5.6;
    //-----------------------------------------------------------------
    public double pTaxs=0.90;
    public double getTaxs(double costAmount){
        double findTaxs = costAmount- (costAmount*pTaxs);
        return findTaxs;
    }
    // this method to return the amount of money that will be paied for the order without taxs
    public double getAmount(){
    meals = chickenAndRice + frenchBreadPizza + chickenWings + friedChicken + salmon + eggRolls + mexicanPizza;
    soups = chickenNoodle + cheeseBurger + minestrone + italianWedding + tortellini + frenchOnion;
    costOfItems= meals + soups;
    allTotal = costOfItems;
    return allTotal;
}
    

}
