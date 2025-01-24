package Homebudget4;
public class HomeIncome{
    int income;
    int income2;
    public HomeIncome(int income,int income2){
        this.income = income;
        this.income2=income2;

    }
    public int add2(){
        int total2 = income+income2;
        return total2;
        
    }
    
}