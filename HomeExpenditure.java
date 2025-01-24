package  Homebudget4;
public class HomeExpenditure{
    int petrol;
    int emi;
    public HomeExpenditure(int petrol,int emi){
        this.petrol=petrol;
        this.emi=emi;

    }
    public int add(){
        int total=petrol+emi;
        return total;
    }
    
}