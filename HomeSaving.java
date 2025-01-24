package Homebudget5;

import Homebudget4.HomeExpenditure;
import Homebudget4.HomeIncome;
public class HomeSaving{
    public static void main(String args[], HomeIncome HomeIncome){
       HomeIncome = new  HomeIncome(5000000,40000);
        HomeExpenditure h = new HomeExpenditure(30000,40000);
        int totalincome = HomeIncome.add();
        int total4 = HomeExpenditure.add2();
        int saving;
        saving = totalincome-total4;
        System.out.println("The saving isb "+saving);
    }
}