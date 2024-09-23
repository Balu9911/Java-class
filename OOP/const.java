public class account{
    int acc_id;
    String acc_name;
    double act_bal=0;
   public  account(int id,String name,double amount){
        this.acc_id=id;
        this.acc_name=name;
        this.act_bal=amount;
    }
    public void open_acc(){}
    public boolean deposit_amount(){
        return true;
    }
    public double get_bal(){
        return 500.00;
    }
    public static void main(String[] args) {
        account a1=new account(101, "balu" , 80,000);
        a1.deposit_amount();
    }
    
}