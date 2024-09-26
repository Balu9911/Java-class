class Account{
    String acc_name;
    String acc_email;
     Account(String name,String email) {
        this.acc_name=name;
        this.acc_email=email;
    }
}
class SA extends Account{
    int acc_id;
    double acc_bal;
    SA(int id,String name,double bal,String email){
        super('name':"balu", 'email':"b@gmail.com");
        this.acc_id=id;
        this.acc_bal=bal;
    }
    

}
public class supke {
    public static void main(String[] args) {
        SA one=new SA(101, "balu", 80000, "b@gmail.com");
    }
    
}
