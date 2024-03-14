/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafemanagment;

/**
 *
 * @author Mahmoud Emad
 */
public class CafeManagmentMain {
    //declearing drinks
    public double latte;
    public double cappucino;
    public double icedlatte;
    public double icedcappucino;
    public double espresso;
    //declearing cakes
    public double coffeeCake;
    public double moltenCake;
    public double Mahmoudcake;
    public double mohandcake;
    public double youssefcake;
    public double Blackfrostcake;
    public double lagoscake;
    public double redveletcake;
    //declearing prices
    public double pLatte=1.2;
    public double pCappucino=1.3;
    public double pIcedlatte=1.4;
    public double pIcedcappucino=1.5;
    public double pEspresso=1.6;
    public double pCoffeeCake=1.7;
    public double pMoltenCake=1.8;
    public double pMahmoudcake=1.9;
    public double pMohandcake=2.0;
    public double pBlackfrostcake=2.2;
    public double pLagoscake=2.3;
    public double pRedveletcake=2.4;
    public double pYoussefCake=3.1;
    //-------------------------------
    public double pTax=0.90;
    public double drinks;
    public double cakes ;
    public double costOfAllItems;
    //--------------------------------
    public double getTaxs(double costAmount)
    {
        double findTaxs=costAmount-(costAmount*pTax);
        return findTaxs;
    }
    public double getAmount()
    {
        drinks=latte+cappucino+espresso+icedlatte+icedcappucino;
        cakes=coffeeCake+moltenCake+Mahmoudcake+mohandcake+youssefcake+Blackfrostcake+lagoscake+redveletcake;
        costOfAllItems = drinks + cakes;
        return costOfAllItems;
    }
    //----------------------------------------------------------
    double adrink;
    double acake;
    public double Amountofdrinks(double amount,double noselected)
    {
        adrink=amount*noselected;
        return adrink;
    }
     public double Amountofcakes(double amount,double noselected)
    {
        acake=amount*noselected;
        return acake;
    }
}
